package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int animalSpeed;

    public Animal(int maxSpeed) {
        this.animalSpeed = new SecureRandom().nextInt(maxSpeed);
    }

    public Animal(String name, int animalSpeed) {
        this.name = name;
        this.animalSpeed = animalSpeed;
    }

    public int speed(){
        return this.animalSpeed;
    }

}
