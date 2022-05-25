package lab_03;

import java.util.Scanner;

public class CountOddEvenArray {
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

        // Print out and count odd & even within the array
        int i = 0;
        int even_count = 0;
        int odd_count = 0;
        System.out.println("The array is: ");
        for (;i<lengthArray;i++) {
            System.out.printf("%d\t",userArray[i]);
            if (userArray[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println();
        System.out.printf("Count of even items: %d \n",even_count);
        System.out.printf("Count of odd items: %d \n",odd_count);
    }
}
