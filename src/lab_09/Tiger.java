package lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int MAX_SPEED_TIGER = 100;
    private int speed;

    public Tiger() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED_TIGER);
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
