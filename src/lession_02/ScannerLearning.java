package lession_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        System.out.print("Please input a number: \t");
        Scanner scanner = new Scanner(System.in);
        int numScanner = scanner.nextInt();
        System.out.printf("You just input %d \n", numScanner);
    }
}
