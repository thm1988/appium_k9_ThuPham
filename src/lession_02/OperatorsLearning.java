package lession_02;

public class OperatorsLearning {

    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;
        int myNum = ++myNum1 + myNum2++;
        System.out.println(myNum1);
        System.out.println(myNum2);
        System.out.println(myNum);

        // Prefix first -> right operator -> assigned to the left -> Suffix last

    }
}
