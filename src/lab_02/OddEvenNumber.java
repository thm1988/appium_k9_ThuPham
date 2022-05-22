package lab_02;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int userNumber = scanner.nextInt();

        System.out.printf("You input the following number: %d \n", userNumber);
        if (userNumber%2 == 0){
            System.out.println("You input even number");
        }
        else
            System.out.println("You input odd number");
    }
}
