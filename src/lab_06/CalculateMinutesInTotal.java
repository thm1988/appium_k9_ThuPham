package lab_06;

public class CalculateMinutesInTotal {
    public static void main(String[] args) {
        String userInput = "2hrs and 5 minutes";
        String userHours = userInput.substring(0,1);
        String userMinutes = userInput.substring(9,10);

        int convertHours=Integer.valueOf(userHours);
        int calculateMinutes=convertHours*60;
        int totalMinutes = calculateMinutes + Integer.valueOf(userMinutes);

        System.out.println("Total minutes is: " + totalMinutes);
    }
}
