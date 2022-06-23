package lab_09;

import java.security.SecureRandom;

public abstract class Animal {
    private String name;
    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract int speed();
}
