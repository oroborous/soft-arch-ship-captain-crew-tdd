package edu.wctc;

import java.util.Random;

public class Die {
    private int faceValue;
    private boolean isHeld;
    private Random random = new Random();
    public int getFaceValue() {
        return faceValue;
    }

    public void hold() {
        this.isHeld = true;
    }

    public boolean isHeld() {
        return isHeld;
    }

    public void roll() {
        faceValue = random.nextInt(1, 7);
    }
}
