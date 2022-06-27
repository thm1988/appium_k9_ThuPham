package lab_09;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static int MAX_SPEED_HORSE = 75;
    private int speed;

    public Horse() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED_HORSE);
    }

    @Override
    public int speed() {
        return this.speed;
    }

    // Simulate the test
//    public int speed() {
//        return 45;
//    }

}

// Simulate the test
//    public int speed() {
//        return 45;
//    }

