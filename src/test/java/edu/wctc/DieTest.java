package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
    private Die die;

    @BeforeEach
    public void setup() {
        die = new Die();
    }

    @Test
    public void canRollDie() {
        die.roll();
    }

    @Test
    public void rollValueInRange() {
        for (int i = 0; i < 100; i++) {
            int faceValue = die.getFaceValue();
            assertTrue(faceValue >= 1 && faceValue <= 6,
                    String.format("Face value (%d) should be between 1 and 6", faceValue));
        }
    }

    @Test
    public void canHold() {
        die.hold();

        assertTrue(die.isHeld(), "Die should be held when instructed");
    }

    @Test
    public void rolledWhenCreated() {
        assertNotEquals(0, die.getFaceValue(), "Die should be rolled initially when created");
    }

    @Test
    public void notRolledWhenHeld() {
        die.hold();
        int faceValue = die.getFaceValue();

        for (int i = 0; i < 100; i++) {
            die.roll();
            assertEquals(faceValue, die.getFaceValue(), "Face value should not change when die is held");
        }
    }
}
