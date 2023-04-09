package edu.wctc;

import java.util.Random;

public class Die {
    private int faceValue;
    private Random random = new Random();
    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(1, 7);
    }
}
