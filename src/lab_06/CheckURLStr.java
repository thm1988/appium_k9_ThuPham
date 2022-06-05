package lab_06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CheckURLStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please help to input string: \t");
        String userInPutURL = scanner.nextLine().trim();

        String[] splitUserStr = userInPutURL.split("://");
//        System.out.println(Arrays.toString(splitUserStr));
        System.out.println("User input " + splitUserStr[0] + " in URL address");
        if (splitUserStr[1].contains("www.")) {
            System.out.println("Domain name is: " + splitUserStr[1].substring(4, splitUserStr[1].lastIndexOf(".")));
        } else {
            System.out.println("Domain name is: " + splitUserStr[1].substring(0, splitUserStr[1].lastIndexOf(".")));
        }
        System.out.println("Last part is : " + splitUserStr[1].substring(splitUserStr[1].lastIndexOf(".") + 1));
    }
}
