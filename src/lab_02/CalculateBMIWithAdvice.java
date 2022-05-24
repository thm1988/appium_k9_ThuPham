package lab_02;

import java.util.Scanner;

public class CalculateBMIWithAdvice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height: ");
        float userHeight = scanner.nextFloat();
        while (userHeight > 2.2f || userHeight < 1.0f){
            System.out.print("You should input your correct height (< 2.2m || > 1m): \t");
            userHeight = scanner.nextFloat();
        }

        System.out.print("Please input your weight: ");
        float userWeight = scanner.nextFloat();

        // Calculate BMI
        float BMIResult = userWeight/(userHeight * 2);
        System.out.printf("Your BMI value is : %f\n", BMIResult);
        float minWeight = 18.5f * 2 * userHeight;
        float maxWeight = 24.9f * 2 * userHeight;
        if (BMIResult < 18.5f) {
            System.out.println("You are underweight");
            //float minWeight = 18.5f * 2 * userHeight;
            float weightDifference = minWeight - userWeight;
            System.out.printf("You should increase %f kg \n",weightDifference);
            }
        else if (BMIResult <= 24.9f) {
            System.out.println("You are normal weight");
        }
        else if (BMIResult <= 29.9f) {
            System.out.println("You are overweight");
            //float overWeight = 29.9f * 2 * userHeight;
            float weightDifference = userWeight - maxWeight;
            System.out.printf("You should reduce %f kg \n",weightDifference);
        }
        else {
            System.out.println("You got obesity");
            //float obesityWeight = 30f * 2 * userHeight;
            float obesityDifference = userWeight - maxWeight;
            System.out.printf("You should reduce %f kg \n",obesityDifference);
        }
    }

}


