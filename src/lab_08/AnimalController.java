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
        System.out.println("List of all animals: " + animalList);

    }

}

