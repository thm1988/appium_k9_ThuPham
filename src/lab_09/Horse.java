package lab_09;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static int MAX_SPEED_HORSE = 75;

    public Horse() {
        super(MAX_SPEED_HORSE);

    }

    @Override
    public int setSpeed() {
        return this.getAnimalSpeed();
    }

}
// Simulate the test
//    public int speed() {
//        return 45;
//    }

