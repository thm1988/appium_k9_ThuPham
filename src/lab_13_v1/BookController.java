package lab_13_v1;

import java.io.File;
import java.util.List;
import java.util.Scanner;
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
            relativeFilePath = "\\src\\lab_13_v1\\BookData.csv";
        } else {
            relativeFilePath = "/src/lab_13_v1/BookData.csv";
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
        // Declare FILE
        File file = new File(filePath);

        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your choice: \t");
            // Declare the value of menu
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("1. New book");
                    DataFactory.createBook(file);
                    break;
                case 2:
                    System.out.println("2. Find a book(ISBN)");
                    DataFactory.findBook(file);
                    break;
                case 3:
                    System.out.println("3. Update a book");
                    DataFactory.updateBook(file);
                    break;
                case 4:
                    System.out.println("4. Delete a book");
                    DataFactory.deleteBook(file);
                    break;
                case 5:
                    System.out.println("5. Print the book list");
                    DataFactory.printBookList(file);
                    break;
                case 0:
                    System.out.println("Now exit!!!");
                    isContinuing = false;
                default:
                    continue;
            }
        } while (isContinuing);
    }
}


