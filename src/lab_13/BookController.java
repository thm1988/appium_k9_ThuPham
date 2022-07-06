package lab_13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookController {

    public static void main(String[] args) {
        String relativeFilePath = getOSType();
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
        manageBook(absoluteFilePath);
    }

    private static String getOSType() {
        String OS = System.getProperty("os.name");
        String relativeFilePath = null;
        if (OS.startsWith("Windows")) {
            relativeFilePath = "\\src\\lab_13\\BookData.csv";
        } else {
            relativeFilePath = "/src/lab_13/BookData.csv";
        }
        return relativeFilePath;
    }

    public static void printMenu() {
        System.out.println("======= Book Management Program (CRUD)============");
        System.out.println("\t 1. New book");
        System.out.println("\t 2. Find a book(ISBN)");
        System.out.println("\t 3. Update a book");
        System.out.println("\t 4. Delete a book");
        System.out.println("\t 5. Print the book list");
        System.out.println("\t 0. Exit");
    }

    public static void manageBook(String filePath) {
        boolean isContinuing = true;
        int userChoice;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your choice: \t");
            // Declare the value of menu
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("1. New book");
                    List<Book> oldBookList = DataFactory.getBookListFromFile(filePath);
                    List<Book> bookEntryUser = DataFactory.getNewBook();
                    List<Book> combineBookList = Stream.concat(oldBookList.stream(), bookEntryUser.stream())
                            .collect(Collectors.toList());
                    DataFactory.saveBookListToFile(combineBookList, filePath);
                    break;
                case 2:
                    System.out.println("2. Find a book(ISBN)");
                    System.out.println("Please enter the ISBN for searching: ");
                    int userSearchISBN = scanner.nextInt();
                    List<Book> searchBookResult = DataFactory.findBookFromList(userSearchISBN, filePath);
                    if (!searchBookResult.isEmpty()) {
                        printBookList(searchBookResult);
                    } else {
                        System.out.println("[INF] No entry was found !!!");
                    }
                    break;
                case 3:
                    System.out.println("3. Update a book");
                    System.out.println("Please enter the ISBN for updating: ");
                    int userUpdateISBN = scanner.nextInt();
                    // To find list of matching books
                    List<Book> updateBookResult = DataFactory.findBookFromList(userUpdateISBN, filePath);
                    Map<Integer, List<Book>> mapBookResult = DataFactory.updateBookList(userUpdateISBN,updateBookResult);
                    List<Book> oldBookListForUpdate = DataFactory.getBookListFromFile(filePath);
                    //List<Book> combineBookListForUpdate = Stream.concat(oldBookListForUpdate.stream(), mapBookResult.get(userUpdateISBN).stream())
                            //.collect(Collectors.toList());
                    DataFactory.saveBookListToFile(,filePath);
                    //updateBookList(updateBook,bookListToUpdateResult);
                    break;
                case 4:
                    System.out.println("4. Delete a book");
                    break;
                case 5:
                    System.out.println("5. Print the book list");
                    List<Book> bookList = DataFactory.getBookListFromFile(filePath);
                    printBookList(bookList);
                    break;
                case 0:
                    System.out.println("Now exit!!!");
                    isContinuing = false;
                default:
                    continue;
            }
        } while (isContinuing);
    }


    private static void printBookList(List<Book> bookList) {
        for (int index = 0; index < bookList.size(); index++) {
            System.out.println("Book : " + (index + 1));
            System.out.println("ISBN : " + bookList.get(index).getISBN());
            System.out.println("Title : " + bookList.get(index).getTitle());
            System.out.println("Author : " + bookList.get(index).getAuthor());
            System.out.println("Year : " + bookList.get(index).getYear());
            System.out.println();
        }
    }

    private static void printBook(Book book) {
        System.out.println("ISBN : " + book.getISBN());
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Year : " + book.getYear());
        System.out.println();
    }
}


