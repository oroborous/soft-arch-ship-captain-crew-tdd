package edu.wctc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @Test
    public void canRollDie() {
        Die die = new Die();
        die.roll();
    }

    @Test
    public void rollValueInRange() {
        Die die = new Die();
        for (int i = 0; i < 100; i++) {
            die.roll();
            int faceValue = die.getFaceValue();
            assertTrue(faceValue >= 1 && faceValue <= 6,
                    String.format("Face value (%d) should be between 1 and 6", faceValue));
        }
    }
}
