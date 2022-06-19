package lab_08;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int animalSpeed;
    private boolean flyAble;

    // Create protected Animal
    protected Animal(Builder builder){
        name = builder.name;
        animalSpeed = builder.animalSpeed;
        flyAble = builder.flyAble;
    }

    // READ ONLY


    public String getName() {
        return name;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    // Inner class
    public static class Builder{
        private String name;
        private int animalSpeed;
        private boolean flyAble;

        public void setName(String name) {
            this.name = name;
        }

        public void setAnimalSpeed(int animalSpeed) {
            this.animalSpeed = new SecureRandom().nextInt(animalSpeed);
        }

        public void setFlyAble(boolean flyAble) {
            this.flyAble = flyAble;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalSpeed=" + animalSpeed +
                ", flyAble=" + flyAble +
                '}';
    }
}
