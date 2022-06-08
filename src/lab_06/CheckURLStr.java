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
        System.out.println("URL Scheme " + splitUserStr[0]);
        if (splitUserStr[1].contains("www.")) {
            System.out.println("Second-level domain: " + splitUserStr[1].substring(4, splitUserStr[1].lastIndexOf(".")));
        } else {
            System.out.println("Second-level domain: " + splitUserStr[1].substring(0, splitUserStr[1].lastIndexOf(".")));
        }
        System.out.println("Top-level domain : " + splitUserStr[1].substring(splitUserStr[1].lastIndexOf(".") + 1));
    }
}
