package lab_08;

import java.util.*;

public class AnimalController {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        dog.setName(dog.getClass().getSimpleName());
        horse.setName(horse.getClass().getSimpleName());
        tiger.setName(tiger.getClass().getSimpleName());

        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(dog, horse, tiger));
        Map<Integer, List<Animal>> animalData = new HashMap<>();

        // Add value to animalData
        for (Animal animal : animalList) {
            if (animalData.containsKey(animal.speed())) {
                animalData.get(animal.speed()).add(animal);
            } else {
                animalData.put(animal.speed(), new ArrayList(Arrays.asList(animal)));
            }
        }

        int winnerSpeed = Collections.max(animalData.keySet());
        Set<Integer> allSpeed = animalData.keySet();
        List<Animal> winnerAnimalNames = new ArrayList<>();

        animalData.forEach((key, value) -> {
            if (key == winnerSpeed) {
                winnerAnimalNames.addAll(value);
            }
        });

        List<String> animalWinnerNameList = new ArrayList<String>();

        for (Animal winnerAnimalName : winnerAnimalNames) {
            animalWinnerNameList.add(winnerAnimalName.getName());
        }
        System.out.println("Winner is : " + animalWinnerNameList.toString() + " , with speed: " + winnerSpeed);
    }

}

