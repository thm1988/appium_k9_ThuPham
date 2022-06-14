package lab_07_02;

import java.security.SecureRandom;

public class Horse extends Animal{
    private final int MAX_SPEED_HORSE = 75;

    public int speed(){
        int horseSpeed = new SecureRandom().nextInt(MAX_SPEED_HORSE);
        return horseSpeed;
    }

}
