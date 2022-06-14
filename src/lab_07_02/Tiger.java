package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private final int MAX_SPEED_TIGER = 100;

    public int speed(){
        int tigerSpeed = new SecureRandom().nextInt(MAX_SPEED_TIGER);
        return tigerSpeed;
    }
}
