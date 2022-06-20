package lab_07_02;

import java.sql.Array;
import java.util.*;

public class AnimalController {

    public static void main(String[] args) {

        // Initialize the new animals
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        dog.setName(dog.getClass().getSimpleName());
        horse.setName(horse.getClass().getSimpleName());
        tiger.setName(tiger.getClass().getSimpleName());
        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(dog, horse, tiger));
        System.out.println("The initial animal list:" + animalList);
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
            animalWinnerNameList.add(animal.getName());
        }
        System.out.println("Winner is : " + animalWinnerNameList + " , with speed: " + winnerSpeed);
//        int winnerSpeed = Collections.max(animalData.keySet());
//        List<Animal> winnerAnimalNames = new ArrayList<>();
//
//        animalData.forEach((key, value) -> {
//            if (key == winnerSpeed) {
//                winnerAnimalNames.addAll(value);
//            }
//        });
//
//        List<String> animalWinnerNameList = new ArrayList<String>();
//        for (Animal winnerAnimalName : winnerAnimalNames) {
//            animalWinnerNameList.add(winnerAnimalName.getName());
//        }
    }

    private static int findMaxValueFromListOfInteger(List<Integer> integerList) {
        int maxValueReturn = integerList.get(0);
        for (int index = 1; index < integerList.size(); index++) {
            if (integerList.get(index) > maxValueReturn){
                maxValueReturn = integerList.get(index);
            }
        }
        return maxValueReturn;
    }

}

