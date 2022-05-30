package lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListMenu {

    public static void printMenu() {
        System.out.println("===============MENU==============");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("0. Exit");
    }
    public static void addNumberIntoArrayList(List<Integer> userListArg){
        System.out.print("Please help to input your number \t");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        userListArg.add(userInput);
    }
    private static void printNumberFromArraylist(List<Integer> userListArg) {
        System.out.println(Arrays.toString(userListArg.toArray()));
    }

    private static int getMaximumNumberFromArrayList(List<Integer> userListArg) {
        int lengthList = userListArg.size();
        int maxValue = userListArg.get(0);
        for (int index = 0; index < lengthList; index++) {
            if (userListArg.get(index) > maxValue){
                maxValue = userListArg.get(index);
            }
        }
        return maxValue;
    }

    private static int getMinimumNumberFromArrayList(List<Integer> userListArg) {
        int lengthList = userListArg.size();
        int minValue = userListArg.get(0);
        for (int index = 0; index < lengthList; index++) {
            if (userListArg.get(index) < minValue){
                minValue = userListArg.get(index);
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int userChoice = 0;
        boolean flag_not_exit = true;
        List<Integer> userArrayList = new ArrayList<>();
        do {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your choice: \t");
            // Declare the value of menu
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("1. Add number into ArrayList : ");
                    addNumberIntoArrayList(userArrayList);
                    break;
                case 2:
                    System.out.println("2. Print numbers : ");
                    printNumberFromArraylist(userArrayList);
                    break;
                case 3:
                    System.out.println("3. Get maximum number");
                    int maxValueFromList=getMaximumNumberFromArrayList(userArrayList);
                    System.out.printf("Max value from list is : %d \n",maxValueFromList);
                    break;
                case 4:
                    System.out.println("3. Get minimum number");
                    int minValueFromList=getMinimumNumberFromArrayList(userArrayList);
                    System.out.printf("Min value from list is : %d \n",minValueFromList);
                    break;

                case 0:
                    System.out.println("You choose option 0");
                    flag_not_exit=false;
                default:
                    continue;
            }
        } while (flag_not_exit);
    }




}
