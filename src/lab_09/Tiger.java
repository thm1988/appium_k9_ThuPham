package lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int MAX_SPEED_TIGER = 100;


    public Tiger() {
        super(MAX_SPEED_TIGER);

    }

    @Override
    public int setSpeed() {
        return this.getAnimalSpeed();
    }

}
