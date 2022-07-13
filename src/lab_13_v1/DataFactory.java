package lab_13_v1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

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
                    bookArrayList.add(new Book(bookISBN,bookTitle,bookAuthor,bookYear));
            }
            objectOutputStream.writeObject(bookArrayList);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("[ERR] IO problem detected...!!!!");
        }
    }

    public static void findBook(File fileArg) {
    }

    public static void updateBook(File fileArg) {
    }

    public static void deleteBook(File fileArg) {
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
            while (bookListIterator.hasNext()) {
                System.out.println(bookListIterator.next());
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
