package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int userArray[] = new int[arrayLength];
//        userArray[0] = 1;
//        userArray[1] = 2;
//        userArray[2] = 3;
//        userArray[3] = 4;
//        userArray[4] = 5;
        for (int index = 0; index < arrayLength; index++) {
            userArray[index]=++index;
        }

        for (int index = 0; index < arrayLength; index++) {
//            System.out.println(userArray[index]);
            System.out.printf("Element at the index %d has value %d \n", index, userArray[index]);
        }
    }
}
