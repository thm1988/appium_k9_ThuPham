package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int animalSpeed;

    public Animal(int maxSpeed) {
        this.animalSpeed = new SecureRandom().nextInt(maxSpeed);
        //this.animalSpeed = 40;
    }

    public Animal(String name, int animalSpeed) {
        this.name = name;
        this.animalSpeed = animalSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int speed() {
        return this.animalSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
