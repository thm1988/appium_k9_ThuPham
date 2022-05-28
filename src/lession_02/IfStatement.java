package lession_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time: ");
        int userArrival=scanner.nextInt();


        boolean isHeOnTime = userArrival == 7;

        System.out.println("Going to the shop");
        if(isHeOnTime){
            System.out.println("Let's talk");
        } else {
            System.out.println("Write a letter");
        }

        System.out.println("Let's go home");
    }
}
