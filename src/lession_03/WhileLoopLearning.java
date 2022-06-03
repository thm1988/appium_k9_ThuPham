package lession_03;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {
//        boolean somethingIsStillTrue = true;
//        while (somethingIsStillTrue){
//            somethingIsStillTrue = false;
//            System.out.println("Something is still true");
//        }

        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("========Game Menu========");
            System.out.println("1. Generate a number < 1000");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your choice : \t");
            int userOption = scanner.nextInt();

            if (userOption == 0) {
                isContinuing = false;
            } else if (userOption == 1) {
                System.out.println(new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Please help to re-enter again: ");
            }

        }

        System.out.println("GOODBYE");

    }
}
