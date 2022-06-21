package lab_07_helper;

import lab_07_02.Animal;

import java.util.*;

public class Helper {
    public class DefineHelper {
        public static Map<Integer, List<String>> findWinnerAnimalsAndSpeed(List<Animal> animalList) {
            // Create a Map to contain the list of Animals based on the key (speed)
            Map<Integer, List<Animal>> animalData = new HashMap<>();
            // Add value to animalData
            for (Animal animal : animalList) {
                if (animalData.containsKey(animal.speed())) {
                    animalData.get(animal.speed()).add(animal);
                } else {
                    animalData.put(animal.speed(), new ArrayList(Arrays.asList(animal)));
                }
            }

            // Get all key values from the record
            List<Integer> animalSpeedList = new ArrayList<>(animalData.keySet());
            // Find out the winner speed
            int winnerSpeed = findMaxValueFromListOfInteger(animalSpeedList);
            // Get a list of winner animals
            List<Animal> animalWinnerList = new ArrayList<>(animalData.get(winnerSpeed));
            // Loop through the animal winner list and get their names
            List<String> animalWinnerNameList = new ArrayList<>();
            for (Animal animal : animalWinnerList) {
                animalWinnerNameList.add(animal.getClass().getSimpleName());
            }
            Map<Integer, List<String>> resultMethod = new HashMap<>();
            resultMethod.put(winnerSpeed, animalWinnerNameList);
            return resultMethod;
        }

        public static int findMaxValueFromListOfInteger(List<Integer> integerList) {
            int maxValueReturn = integerList.get(0);
            for (int index = 1; index < integerList.size(); index++) {
                if (integerList.get(index) > maxValueReturn) {
                    maxValueReturn = integerList.get(index);
                }
            }
            return maxValueReturn;
        }
    }
}
