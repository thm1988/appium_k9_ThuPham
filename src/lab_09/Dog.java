package lab_09;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static int MAX_SPEED_DOG = 60;

    public Dog() {
        super(MAX_SPEED_DOG);
    }


    @Override
    public int setSpeed() {
        return this.getAnimalSpeed();
    }

    // Simulate the test
//    public int speed() {
//        return 45;
//    }



}
