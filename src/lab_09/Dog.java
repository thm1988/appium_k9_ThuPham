package lab_09;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static int MAX_SPEED_DOG = 60;
    private int speed;

    public Dog() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED_DOG);
    }

    @Override
    public int setSpeed() {
        return this.speed;
    }

    // Simulate the test
//    public int speed() {
//        return 45;
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
