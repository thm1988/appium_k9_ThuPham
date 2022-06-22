package lab_09;

import java.util.*;

import static lab_07_helper.Helper.DefineHelper.findMaxValueFromListOfInteger;

public class AnimalController {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(dog, horse, tiger));
        System.out.println("Animal list: ");
        for (Animal animal : animalList) {
            System.out.printf("Animal name: %s and speed : %d\n", animal.getClass().getSimpleName(), animal.setSpeed());
        }
        Map<Integer, List<String>> result = findWinnerAnimalsAndSpeed(animalList);
        System.out.println("Result is: ");
        result.entrySet().forEach(entry -> {
            System.out.println("Winner is : " + entry.getValue() + " , with speed: " + entry.getKey());
        });
    }

    private static Map<Integer, List<String>> findWinnerAnimalsAndSpeed(List<Animal> animalList) {
        // Create a Map to contain the list of Animals based on the key (setSpeed)
        Map<Integer, List<Animal>> animalData = new HashMap<>();
        // Add value to animalData
        for (Animal animal : animalList) {
            if (animalData.containsKey(animal.setSpeed())) {
                animalData.get(animal.setSpeed()).add(animal);
            } else {
                animalData.put(animal.setSpeed(), new ArrayList(Arrays.asList(animal)));
            }
        }
        // Get all key values from the record
        List<Integer> animalSpeedList = new ArrayList<>(animalData.keySet());
        // Find out the winner setSpeed
        int animalWinnerSpeed = findMaxValueFromListOfInteger(animalSpeedList);
        // Get a list of winner animals
        List<Animal> animalWinnerList = new ArrayList<>(animalData.get(animalWinnerSpeed));
        // Loop through the animal winner list and get their names
        List<String> animalWinnerNameList = new ArrayList<>();
        for (Animal animal : animalWinnerList) {
            animalWinnerNameList.add(animal.getClass().getSimpleName());
        }
        Map<Integer, List<String>> resultMethod = new HashMap<>();
        resultMethod.put(animalWinnerSpeed, animalWinnerNameList);
        return resultMethod;
    }
}

