package lab_07_02;

import java.sql.Array;
import java.util.*;
import static lab_07_helper.Helper.DefineHelper.findWinnerAnimalsAndSpeed;

public class AnimalController {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        List<Animal> animalList = new ArrayList<Animal>(Arrays.asList(dog, horse, tiger));
        System.out.println("Animal list: ");
        for (Animal animal : animalList) {
            System.out.printf("Animal name: %s and speed : %d\n", animal.getClass().getSimpleName(), animal.speed());
        }
        // Find out the list of winner animal
        Map<Integer, List<String>> result = findWinnerAnimalsAndSpeed(animalList);
        result.entrySet().forEach(entry -> {
            System.out.println("Winner is : " + entry.getValue() + " , with speed: " + entry.getKey());
        });
    }
}

