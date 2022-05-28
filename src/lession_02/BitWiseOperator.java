package lession_02;

public class BitWiseOperator {
    public static void main(String[] args) {
        if (firstMethod() && secondMethod()){
            System.out.println("Both And");
        }
    }

    public static boolean firstMethod(){
        System.out.println("The first method");
        return true;
    }
    public static boolean secondMethod(){
        System.out.println("The second method");
        return false;
    }
}
