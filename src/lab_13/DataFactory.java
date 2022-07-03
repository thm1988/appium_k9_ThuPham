package lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static void readFile(String filePath) {
        System.out.println("[INFO] Read file from: ".concat(filePath));
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            bufferedReader.readLine();
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
            bufferedReader.readLine();
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

    public static void saveBookListToFile(List<Book> bookList, String filePath) throws IOException {
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

}
