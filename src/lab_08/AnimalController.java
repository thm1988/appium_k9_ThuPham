package lab_08;

import java.util.*;
import static lab_07_helper.Helper.DefineHelper.findMaxValueFromListOfInteger;

public class AnimalController {

    public static void main(String[] args) {
        Animal.Builder builder = new Animal.Builder();
        Animal tiger = builder.setName("Tiger").setAnimalSpeed(100).setFlyAble(false).build();
        Animal dog = builder.setName("Dog").setAnimalSpeed(60).setFlyAble(false).build();
        Animal horse = builder.setName("Horse").setAnimalSpeed(75).setFlyAble(false).build();
        Animal eagle = builder.setName("Eagle").setAnimalSpeed(150).setFlyAble(true).build();
        Animal rooster = builder.setName("Rooster").setAnimalSpeed(15).setFlyAble(true).build();
        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(tiger, dog, horse, eagle, rooster));
        System.out.println("Animal list: " + animalList);
        Map<Integer, List<String>> result = findWinnerAnimalsAndSpeed(animalList);
        result.entrySet().forEach(entry -> {
            System.out.println("Winner is : " + entry.getValue() + " , with speed: " + entry.getKey());
        });
    }

    public static Map<Integer, List<String>> findWinnerAnimalsAndSpeed(List<Animal> animalList) {
        // Create a list of non-flyable animal
        List<Animal> animalListWithoutWings = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyAble()) {
                animalListWithoutWings.add(animal);
            }
        }
        System.out.println("Default list of non-flyable animals: " + animalListWithoutWings);
        // Back to lab 07_02 | Create a hashmap with key = Speed /value= Animal and add data into it
        Map<Integer, List<Animal>> animalDataRecord = new HashMap<>();
        for (Animal animal : animalListWithoutWings) {
            if (animalDataRecord.containsKey(animal.getAnimalSpeed())) {
                animalDataRecord.get(animal.getAnimalSpeed()).add(animal);
            } else
                animalDataRecord.put(animal.getAnimalSpeed(), new ArrayList(Arrays.asList(animal)));
        }
        // Find out the winner speed
        int animalWinnerSpeed = Collections.max(animalDataRecord.keySet());
        // Get a list of winner animals
        List<Animal> animalWinnerList = new ArrayList<>(animalDataRecord.get(animalWinnerSpeed));
        // Loop through the animal winner list and get their names
        List<String> animalWinnerNameList = new ArrayList<>();
        for (Animal animal : animalWinnerList) {
            animalWinnerNameList.add(animal.getName());
        }
        Map<Integer, List<String>> resultMethod = new HashMap<>();
        resultMethod.put(animalWinnerSpeed, animalWinnerNameList);
        return resultMethod;
    }
}


