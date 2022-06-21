package lab_08;

import java.util.*;

public class AnimalController {

    public static void main(String[] args) {

        Animal.Builder builder = new Animal.Builder();

        Animal tiger = builder.setName("Tiger").setAnimalSpeed(100).setFlyAble(false).build();
        Animal dog = builder.setName("Dog").setAnimalSpeed(60).setFlyAble(false).build();
        Animal horse = builder.setName("Horse").setAnimalSpeed(75).setFlyAble(false).build();
        Animal eagle = builder.setName("Eagle").setAnimalSpeed(150).setFlyAble(true).build();
        Animal rooster = builder.setName("Rooster").setAnimalSpeed(15).setFlyAble(true).build();

        List<Animal> animalList = new ArrayList<>(Arrays.asList(tiger,dog,horse,eagle,rooster));
        Map<Integer,List<String>> result = findWinnerAnimalsAndSpeed(animalList);
        result.entrySet().forEach(entry -> {
            System.out.println("Winner is : " + entry.getValue() + " , with speed: " + entry.getKey());
        });
    }

    private static Map<Integer, List<String>> findWinnerAnimalsAndSpeed(List<Animal> animalList) {
        System.out.println("The initial animal list: "+ animalList);

        // Create a list of non-flyable animal
        List<Animal> animalListWithoutWings = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyAble()){
                animalListWithoutWings.add(animal);
            }
        }
        System.out.println("Default list of non-flyable animals: "+ animalListWithoutWings);
        // Back to lab 07_02 | Create a hashmap with key = Speed /value= Animal and add data into it
        Map<Integer, List<Animal>> animalDataRecord = new HashMap<>();
        for (Animal animal : animalListWithoutWings) {
            if(animalDataRecord.containsKey(animal.getAnimalSpeed())){
                animalDataRecord.get(animal.getAnimalSpeed()).add(animal);
            } else
                animalDataRecord.put(animal.getAnimalSpeed(), new ArrayList(Arrays.asList(animal)));
        }
        // Get all key values from the record
        List<Integer> animalSpeedList = new ArrayList<>(animalDataRecord.keySet());
        // Find out the winner speed
        int animalWinnerSpeed = findMaxValueFromListOfInteger(animalSpeedList);
        // Get a list of winner animals
        List<Animal> animalWinnerList = new ArrayList<>(animalDataRecord.get(animalWinnerSpeed));
        // Loop through the animal winner list and get their names
        List<String> animalWinnerNameList = new ArrayList<>();
        for (Animal animal : animalWinnerList) {
            animalWinnerNameList.add(animal.getName());
        }

        Map<Integer,List<String>> resultMethod = new HashMap<>();
        resultMethod.put(animalWinnerSpeed,animalWinnerNameList);
        return resultMethod;
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

