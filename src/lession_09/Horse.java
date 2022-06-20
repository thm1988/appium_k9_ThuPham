package lession_09;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static int MAX_SPEED_HORSE = 75;
    private int horseSpeed;

    public Horse() {
        this.horseSpeed = new SecureRandom().nextInt(MAX_SPEED_HORSE);
    }

    @Override
    public int speed() {
        return this.horseSpeed;
    }

    // Simulate the test
//    public int speed() {
//        return 45;
//    }
}
