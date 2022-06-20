package lession_09;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int MAX_SPEED_TIGER = 100;
    private int tigerSpeed;


    public Tiger() {
        this.tigerSpeed = new SecureRandom().nextInt(MAX_SPEED_TIGER);
    }

    @Override
    public int speed() {
        return this.tigerSpeed;
    }
}
