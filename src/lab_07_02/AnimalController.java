package lab_07_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        int dogSpeed = dog.speed();
        int horseSpeed = horse.speed();
        int tigerSpeed = tiger.speed();


        int winnerSpeed = findFastestSpeed(Arrays.asList(dogSpeed,horseSpeed,tigerSpeed));

        Map<Integer, List<Animal>> animalData = new HashMap();
        animalData.put();



    }

    private static boolean checkEqualSpeed(List<Integer> speedList) {

    }

    private static int findFastestSpeed(List<Integer> speedList) {
        int tempValue = speedList.get(0);
        for (int indexSpeed = 1; indexSpeed < speedList.size(); indexSpeed++) {
            if (speedList.get(indexSpeed) > tempValue){
                tempValue = speedList.get(indexSpeed);
            }
        }
        return tempValue;
    }

}
