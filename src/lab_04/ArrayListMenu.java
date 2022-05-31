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
        System.out.println("5. Search number");
        System.out.println("0. Exit");
    }
    public static void addNumberIntoArrayList(List<Integer> userListArg){
        System.out.print("How many numbers do you want to add into list ? \t");
        Scanner scanner = new Scanner(System.in);
        int numbersAmount = scanner.nextInt();

        for (int i = 0; i < numbersAmount; i++) {
            System.out.printf("Please input the value for index %d :\t" , i);
            userListArg.add(scanner.nextInt());
        }
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
    private static int searchNumberArrayList(int userNumber,List<Integer> userListArg) {
        int lengthList = userListArg.size();
        int indexResult = 0;
        for (int index = 0; index < lengthList; index++) {
            if (userListArg.get(index) == userNumber) {
                indexResult = index;
                break;
            }
        }
        return indexResult;
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
                    System.out.println("Add number into ArrayList : ");
                    addNumberIntoArrayList(userArrayList);
                    break;
                case 2:
                    System.out.println("Print numbers : ");
                    printNumberFromArraylist(userArrayList);
                    break;
                case 3:
                    System.out.println("Get maximum number");
                    int maxValueFromList=getMaximumNumberFromArrayList(userArrayList);
                    System.out.printf("Max value from list is : %d \n",maxValueFromList);
                    break;
                case 4:
                    System.out.println("Get minimum number");
                    int minValueFromList=getMinimumNumberFromArrayList(userArrayList);
                    System.out.printf("Min value from list is : %d \n",minValueFromList);
                    break;
                case 5:
                    System.out.println("Search number");
                    System.out.print("Please input the number: \t");
                    int userInputNumber = scanner.nextInt();
                    int indexResult=searchNumberArrayList(userInputNumber,userArrayList);
                    System.out.printf("The indicated index of number is : %d \n",indexResult);
                    break;
                case 0:
                    System.out.println("Now exit!!!");
                    flag_not_exit=false;
                default:
                    continue;
            }
        } while (flag_not_exit);
    }




}
