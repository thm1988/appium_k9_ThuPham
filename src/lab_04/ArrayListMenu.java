package lab_04;

import java.util.Scanner;

public class ArrayListMenu {

    public static void printMenu() {
        System.out.println("===============MENU==============");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        int userChoice = 0;
        boolean flag_exit = true;
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your choice: \t");
            // Declare the value of menu
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Đây là số 1");
                    break;
                case 2:
                    System.out.println("Đây là số 2");
                    break;
                case 3:
                    System.out.println("Đây là số 3");
                    break;
                case 4:
                    System.out.println("Đây là số 4");
                    break;
                case 0:
                    System.out.println("You choose option 0");
                    flag_exit=false;
                default:
                    continue;
            }
        } while (flag_exit);
    }
}
