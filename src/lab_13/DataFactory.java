package lab_13;

import java.io.*;
import java.util.*;

public class DataFactory {
    public static void readFile(String filePath) {
        System.out.println("[INFO] Read file from: ".concat(filePath));
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            //bufferedReader.readLine();
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File is not found!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> getBookListFromFile(String filePath) {
        System.out.println("[INFO] Read file from: ".concat(filePath));
        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            //bufferedReader.readLine();
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {

                String[] bookData = dataLine.split(";");
                int bookISBN = Integer.parseInt(bookData[0]);
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);
                Book bookEntry = new Book(bookISBN, bookTitle, bookAuthor, bookYear);
                bookList.add(bookEntry);

                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File is not found!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public static void saveBookListToFile(List<Book> bookList, String filePath) {
        System.out.println("[INFO] Save books to: ".concat(filePath));

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File is not found!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Book findBookFromList(int ISBN , String filePath) {
        List<Book> bookList = getBookListFromFile(filePath);
        Book bookResult = null;
        for (Book book : bookList) {
            if (book.getISBN() == ISBN) {
                bookResult = book;
            }
        }
        return bookResult;
    }

    public static Book updateBook(int ISBNArg, Book bookArg) {

        Scanner scanner = new Scanner(System.in);
        Book resultBookUpdate = new Book();

        resultBookUpdate.setISBN(ISBNArg);
        System.out.println("Please input the new book name: ");
        resultBookUpdate.setTitle(scanner.nextLine());
        System.out.println("Please input the new book author: ");
        resultBookUpdate.setAuthor(scanner.nextLine());
        System.out.println("Please input the new year: ");
        resultBookUpdate.setYear(scanner.nextInt());

        return resultBookUpdate;
    }

    public static List<Book> getNewBook() {
        System.out.print("How many book(s) do you want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = scanner.nextInt();
        List<Book> bookList = new ArrayList<>();
        for (int index = 0; index < numberOfBooks; index++) {
            System.out.printf("Enter value for book number %d ", ++index);
            Book book = new Book();
            System.out.print("Enter ISBN: ");
            book.setISBN(scanner.nextInt());
            System.out.print("Enter Title: ");
            scanner.nextLine();
            book.setTitle(scanner.nextLine());
            System.out.print("Enter Author: ");
            book.setAuthor(scanner.nextLine());
            System.out.print("Enter Year: ");
            book.setYear(scanner.nextInt());
            bookList.add(book);
        }
        return bookList;
    }

}
