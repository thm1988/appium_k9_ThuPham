package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int userArray[] = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            userArray[index]=index++;
        }

        for (int index = 0; index < arrayLength; index++) {
//            System.out.println(userArray[index]);
            System.out.printf("Element at the index %d has value %d \n", index, userArray[index]);
        }
    }
}
