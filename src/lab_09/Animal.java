package lab_09;

import java.security.SecureRandom;

public abstract class Animal {
    private String name;
    private int animalSpeed;
    public Animal(int animalMaxSpeed) {
        this.animalSpeed = new SecureRandom().nextInt(animalMaxSpeed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAnimalSpeed() {
        return this.animalSpeed;
    }

    public abstract int setSpeed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
