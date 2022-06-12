package lession_04;

public class ArrayPostFixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        System.out.println(c);
        int arrayUsr[] = new int[5];


//        for (int index = 0; index < 5; index++) {
//            arrayUsr[index] = index++;
//        }

//        for (int value : arrayUsr) {
//            System.out.println(value);
//        }
        int arrayUserInit[] = {9,9,9,9,9};
        for (int index = 0; index < arrayUserInit.length;) {
            arrayUserInit[index++] = index +1;
        }

        for (int value : arrayUserInit) {
            System.out.println(value);
        }
    }





    }
