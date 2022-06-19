package lab_08;

import java.util.*;

public class AnimalController {

    public static void main(String[] args) {

        Animal.Builder builder = new Animal.Builder();

        builder.setName("Ho");
        builder.setAnimalSpeed(75);
        builder.setFlyAble(false);
        Animal ho = builder.build();

        builder.setName("Eagle");
        builder.setAnimalSpeed(80);
        builder.setFlyAble(true);
        Animal eagle = builder.build();

        System.out.println(ho.getName());
        System.out.println(eagle);
    }

}

