package lession_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of weekdays : ");
        int userNumber = scanner.nextInt();

//        switch (userNumber){
//            case 1:
//                System.out.println("You got first prize!!!");
//                break;
//            case 2:
//                System.out.println("You got second prize!!!");
//                break;
//            case 3:
//                System.out.println("You got third prize!!!");
//                break;
//            default:
//                System.out.println("Sorry~~~");
//
//        }

        switch (userNumber){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
