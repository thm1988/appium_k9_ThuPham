package lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {

    static void sortArray(int array[]) {
        int lengthArray = array.length;
        for (int i = 0; i < (lengthArray - 1); i++) {
            for (int j = 0; j < (lengthArray - i - 1); j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Array 1
        // User input array length function
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length of array 1: \t");
        int lengthArray1 = scanner.nextInt();

        // Declare the array
        int[] userArray1 = new int[lengthArray1];
        for (int i = 0; i < lengthArray1; i++) {
            System.out.print("Please input the " + i + " item: \t");
            userArray1[i] = scanner.nextInt();
        }
        // Array 2
        System.out.print("Please input the length of array 2: \t");
        int lengthArray2 = scanner.nextInt();

        // Declare the array
        int[] userArray2 = new int[lengthArray2];
        for (int i = 0; i < lengthArray2; i++) {
            System.out.print("Please input the " + i + " item: \t");
            userArray2[i] = scanner.nextInt();
        }
        //Print the array
        System.out.println("The array 1 is : ");
        System.out.println(Arrays.toString(userArray1));
        System.out.println("The array 2 is : ");
        System.out.println(Arrays.toString(userArray2));

        // Merge 2 arrays
        int lengthMergedArray = lengthArray1 + lengthArray2;
        int userMergedArray[] = new int[lengthMergedArray];

        int position = 0;
        for (int elementArray1 : userArray1) {
            userMergedArray[position] = elementArray1;
            position++;
        }
        for (int elementArray2 : userArray2) {
            userMergedArray[position] = elementArray2;
            position++;
        }
        // Print out the merged array
        System.out.println("The merged array before sorting:  ");
        System.out.println(Arrays.toString(userMergedArray));
        sortArray(userMergedArray);
        System.out.println("The merged array after sorting:  ");
        System.out.println(Arrays.toString(userMergedArray));
    }


}