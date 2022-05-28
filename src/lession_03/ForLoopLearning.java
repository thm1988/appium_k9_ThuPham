package lession_03;

public class ForLoopLearning {
    public static void main(String[] args) {
        int MaxNumber = 10;
//        for (int i=0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (;  ; ) {
//            System.out.println("Infinity loop");
//        }
        for (int i = 0; i < MaxNumber; ) {
            System.out.println(i);
            ++i;
        }

        System.out.println("Last Statement");
    }
}
