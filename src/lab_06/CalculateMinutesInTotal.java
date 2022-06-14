package lab_06;

public class CalculateMinutesInTotal {
    public static void main(String[] args) {
        String userInput = "2hrs and 5 minutes";
//        String userHours = userInput.substring(0,1);
//        String userMinutes = userInput.substring(9,10);
        // Get the index of hours and minutes
        int hrsIndex = userInput.indexOf("hrs");
        int minutesIndex = userInput.indexOf(" minutes");
        String hrsExtractionStr = userInput.substring(hrsIndex-1,1);
        String minutesExtractionStr = userInput.substring(minutesIndex-1,minutesIndex);

        int hrsExtraction=Integer.valueOf(hrsExtractionStr);
        int calculateMinutes=hrsExtraction*60;
        int totalMinutes = calculateMinutes + Integer.valueOf(minutesExtractionStr);

        System.out.println("Total minutes is: " + totalMinutes);
    }
}
