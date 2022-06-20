package lession_09;

import java.security.SecureRandom;

public abstract class  Animal {
    private String name;
    private int animalSpeed;

    public Animal() {
//        this.animalSpeed = new SecureRandom().nextInt(maxSpeed);
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

    public abstract int speed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
