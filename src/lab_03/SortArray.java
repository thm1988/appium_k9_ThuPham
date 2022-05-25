package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        // User input array length function
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length of array: \t");
        int lengthArray = scanner.nextInt();

        // Declare the array
        int[] userArray = new int[lengthArray];
        for(int i = 0;i<lengthArray;i++)
        {
            System.out.print("Please input the " + i + " item: \t");
            userArray[i] = scanner.nextInt();
        }

        //Print the array
        System.out.println("The array is : ");
        System.out.println(Arrays.toString(userArray));

        // Sort the array
        for (int i = 0; i < lengthArray - 1; i++) {
            for (int j = 0; j < (lengthArray - i - 1); j++) {
                if (userArray[j] > userArray[j+1]){
                    int temp = userArray[j];
                    userArray[j] = userArray[j+1];
                    userArray[j+1] = temp;
                }
            }
        }
        //Print the array
        System.out.println("The array after sorting is : ");
        System.out.println(Arrays.toString(userArray));
    }
}
