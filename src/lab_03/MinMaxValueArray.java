package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValueArray {
    public static void main(String[] args) {
        // User input array length function
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length of array: \t");
        int lengthArray = scanner.nextInt();

        // Declare the array
        int userArray[] = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.print("Please input the "+ i + " item: \t");
            userArray[i] = scanner.nextInt();
        }

        //Print the array
        System.out.println("The array is : ");
        System.out.println(Arrays.toString(userArray));

        int minValue = userArray[0];
        int maxValue = userArray[0];
        for (int i = 1; i < lengthArray; i++) {
            if (userArray[i]<=minValue){
                minValue=userArray[i];
            }
            if (userArray[i]>maxValue){
                maxValue=userArray[i];
            }
        }
        System.out.printf("Min value of the array %d \n", minValue);
        System.out.printf("Max value of the array %d \n", maxValue);
    }
}
