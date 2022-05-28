package lession_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age");
        int userAge = scanner.nextInt();
        if (userAge < 18 ){
            System.out.println("Not allow to buy alcohol");
        } else if (userAge <=55 ) {
            System.out.println("Allow to buy alcohol");
        } else {
            System.out.println("Too old to drink");
        }

    }
    
}
