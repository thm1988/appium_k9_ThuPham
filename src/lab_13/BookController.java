package lab_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {

    public static void main(String[] args) {
        String relativeFilePath = "\\src\\lab_13\\BookData.csv";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
        manageBook(absoluteFilePath);
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
                    List<Book> bookEntryUser = enterNewBook();

                    DataFactory.saveBookListToFile(bookEntryUser,filePath);
                    break;
                case 2:
                    System.out.println("2. Find a book(ISBN)");
                    break;
                case 3:
                    System.out.println("3. Update a book");
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
                    isContinuing=false;
                default:
                    continue;
            }
        } while (isContinuing);
    }

    private static List<Book> enterNewBook() {
        List<Book> bookList = new ArrayList<>();
        System.out.print("How many book(s) do you want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = scanner.nextInt();
        for (int index = 0; index < numberOfBooks; index++) {
            System.out.println("Enter the book :" + (index + 1));
            System.out.println("Enter ISBN : ");
            int bookISBN = scanner.nextInt();
            System.out.println("Enter Title : ");
            String bookTitle = scanner.nextLine();
            System.out.println("Enter Author : ");
            String bookAuthor = scanner.nextLine();
            System.out.println("Enter Year : ");
            int bookYear = scanner.nextInt();
            Book bookAdd = new Book(bookISBN,bookTitle,bookAuthor,bookYear);
            bookList.add(bookAdd);
        }
        return bookList;
    }

    private static void printBookList(List<Book> bookList) {
        for (int index = 0; index < bookList.size(); index++) {
            System.out.println("Book : "+ (index + 1));
            System.out.println("ISBN : " + bookList.get(index).getISBN());
            System.out.println("Title : " + bookList.get(index).getTitle());
            System.out.println("Author : " + bookList.get(index).getAuthor());
            System.out.println("Year : " + bookList.get(index).getYear());
            System.out.println();
        }
    }

}
