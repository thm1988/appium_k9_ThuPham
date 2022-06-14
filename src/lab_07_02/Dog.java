package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal{
    private final int MAX_SPEED_DOG = 60;

    public int speed(){
        int dogSpeed = new SecureRandom().nextInt(MAX_SPEED_DOG);
        return dogSpeed;
    }
}
