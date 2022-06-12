package lession_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Guess number < 3
        int countGuess = 0;
        int randomNumber = new SecureRandom().nextInt(10);

        do{

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please help input your number: \t");
            int userNumber = scanner.nextInt();

            if (userNumber == randomNumber){
                System.out.println("Hooray!! Your number is true");
                break;
            }
            System.out.println("Sorry , wrong number!!");
            countGuess++;

        } while(countGuess < 3);

        System.out.println("Program now exit");
    }
}
