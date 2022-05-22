package lab_02;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height: ");
        float userHeight = scanner.nextFloat();

        System.out.print("Please input your weight: ");
        float userWeight = scanner.nextFloat();

        // Calculate BMI
        float BMIResult = userWeight/(userHeight * 2);
        System.out.printf("Your BMI value is : %f\n", BMIResult);

        if (BMIResult < 18.5) {
            System.out.println("You are underweight");
            }
        else if (BMIResult <= 24.9) {
            System.out.println("You are normal weight");
        }
        else if (BMIResult <= 29.9) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You got obesity");
        }
    }

}


