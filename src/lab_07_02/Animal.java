package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    private int animalSpeed;

    public Animal() {
    }

    public Animal(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public int speed(){
        return new SecureRandom().nextInt();
    }
}
