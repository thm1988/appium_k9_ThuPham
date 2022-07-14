package lab_13_v1;

import java.io.*;
import java.util.*;

public class DataFactory {

    static ObjectOutputStream objectOutputStream = null;
    static ObjectInputStream objectInputStream = null;
    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static ListIterator bookListIterator = null;
    public static void createBook(File fileArg) {
        // Get old list book + Update Book
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileArg));
            System.out.println("Please enter number of books you want to enter: ");
            Scanner scanner = new Scanner(System.in);
            int numberOfBooks = scanner.nextInt();
            for (int bookIndex = 0; bookIndex < numberOfBooks; bookIndex++) {
                try {
                    System.out.println("Book number : " + (bookIndex + 1));
                    System.out.println("ISBN: ");
                    int bookISBN = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.println("Year: ");
                    int bookYear = scanner.nextInt();
                    bookArrayList.add(new Book(bookISBN, bookTitle, bookAuthor, bookYear));
                } catch (InputMismatchException e) {
                    System.out.println("[ERR] Please re-enter the correct value!!!");
                    e.printStackTrace();
                    break;
                }
            }
            objectOutputStream.writeObject(bookArrayList);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("[ERR] IO problem detected...!!!!");
        }
    }

    public static void findBook(File fileArg) {
        try {
            if (fileArg.isFile()){
                objectInputStream = new ObjectInputStream(new FileInputStream(fileArg));
                bookArrayList = (ArrayList<Book>)objectInputStream.readObject();
                objectInputStream.close();
            }
            boolean foundBook = false;
            System.out.println("Please enter ISBN to search: ");
            Scanner scanner = new Scanner(System.in);
            int searchISBN = scanner.nextInt();
            bookListIterator = bookArrayList.listIterator();
            while (bookListIterator.hasNext()) {
                Book loopBook = (Book)bookListIterator.next();
                if (loopBook.getISBN() == searchISBN) {
                    System.out.println("Book with ISBN: "+ searchISBN +"is found: ");
                    System.out.println("ISBN: "+ loopBook.getISBN());
                    System.out.println("Title: "+ loopBook.getTitle());
                    System.out.println("Author: "+ loopBook.getAuthor());
                    System.out.println("Year: "+ loopBook.getYear());
                    foundBook = true;
                    break;
                }
            }
            if (!foundBook) {
                System.out.println("[INF] Book with "+ searchISBN + " is not found !!! ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found..!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void updateBook(File fileArg) {
        try {
            if (fileArg.isFile()){
                objectInputStream = new ObjectInputStream(new FileInputStream(fileArg));
                bookArrayList = (ArrayList<Book>)objectInputStream.readObject();
                objectInputStream.close();
            }
            System.out.println("Please enter ISBN that you would like to update: ");
            Scanner scanner = new Scanner(System.in);
            int searchISBN = scanner.nextInt();
            bookListIterator = bookArrayList.listIterator();
            boolean foundBook = false;
            while (bookListIterator.hasNext()) {
                Book loopBook = (Book)bookListIterator.next();
                if (loopBook.getISBN() == searchISBN) {
                    System.out.println("Update book with ISBN: "+ searchISBN +" is found: ");
                    scanner.nextLine();
                    System.out.println("Enter new Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter new Author: ");
                    String bookAuthor = scanner.nextLine();
                    //loopBook.setAuthor(bookAuthor);
                    System.out.println("Enter new Year: ");
                    int bookYear = scanner.nextInt();
                    bookListIterator.set(new Book(searchISBN,bookTitle,bookAuthor,bookYear));
                    foundBook = true;
                    break;
                }
            }
            if (foundBook) {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileArg));
                objectOutputStream.writeObject(bookArrayList);
                objectOutputStream.close();
                System.out.println("Record updated successfully !!!");
            } else {
                System.out.println("[INF] Book with "+ searchISBN + " is not found !!! ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found..!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void deleteBook(File fileArg) {
        try {
            if (fileArg.isFile()){
                objectInputStream = new ObjectInputStream(new FileInputStream(fileArg));
                bookArrayList = (ArrayList<Book>)objectInputStream.readObject();
                objectInputStream.close();
            }
            System.out.println("Please enter ISBN that you would like to delete: ");
            Scanner scanner = new Scanner(System.in);
            int searchISBN = scanner.nextInt();
            bookListIterator = bookArrayList.listIterator();
            boolean foundBook = false;
            while (bookListIterator.hasNext()) {
                Book loopBook = (Book)bookListIterator.next();
                if (loopBook.getISBN() == searchISBN) {
                    bookListIterator.remove();
                    foundBook = true;
                    break;
                }
            }
            if (foundBook) {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileArg));
                objectOutputStream.writeObject(bookArrayList);
                objectOutputStream.close();
                System.out.println("Record deleted successfully !!!");
            } else {
                System.out.println("[INF] Book with "+ searchISBN + "is not found !!! ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found..!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printBookList(File fileArg) {
        System.out.println("---------------------------------");
        try {
            if (fileArg.isFile()){
                objectInputStream = new ObjectInputStream(new FileInputStream(fileArg));
                bookArrayList = (ArrayList<Book>)objectInputStream.readObject();
                objectInputStream.close();
            }
            bookListIterator = bookArrayList.listIterator();
            int count = 1;
            while (bookListIterator.hasNext()) {
                Book loopBook = (Book)bookListIterator.next();
                System.out.println("Book: "+ count);
                System.out.println("ISBN: "+ loopBook.getISBN());
                System.out.println("Title: "+ loopBook.getTitle());
                System.out.println("Author: "+ loopBook.getAuthor());
                System.out.println("Year: "+ loopBook.getYear());
                System.out.println();
                count++;
            }
            System.out.println("---------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found..!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
