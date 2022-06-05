package lab_06;

import java.util.Scanner;

public class InputMaximumPassword3times {
    public static void main(String[] args) {
        String myPassword = "password123";
        int countPasswordUser = 0;
        while (countPasswordUser < 4){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your password: \t");
            String userInputPassword = scanner.next();
            if (!userInputPassword.equals(myPassword)){
                System.out.printf("You input wrong password the %d time (maximum 3 times) \n",countPasswordUser);
                countPasswordUser++;
            } else {
                System.out.println("[Success] You input the correct password");
                break;
            }
        }
        System.out.println("Now exit the program!!!");
    }
}
