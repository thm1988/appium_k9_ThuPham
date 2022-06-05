package lab_06;

import java.util.Scanner;

public class ExtractDigitCharactersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please help to input string: \t");
        String userInPutString = scanner.nextLine();
        System.out.println("You input the below string: " + userInPutString);
        System.out.printf("Digit integer after extract is: " + extractDigitCharacters(userInPutString));
    }

    private static String extractDigitCharacters(String userStrArgs) {
        char[] userCharsArgs = userStrArgs.toCharArray();
        String extractString = "";
        for (int index = 0; index < userCharsArgs.length; index++) {
            if (Character.isDigit(userCharsArgs[index])){
                extractString = extractString + userCharsArgs[index];
            }
        }
        return extractString;
    }

//    private static String removeCharacterFromString(String userStrArgs, char c){
//        String newString = "";
//        for (int index = 0; index < userStrArgs.length(); index++) {
//            if (userStrArgs.charAt(index) != c){
//                newString = newString + userStrArgs.charAt(index);
//            }
//        }
//        return newString;
//    }

}
