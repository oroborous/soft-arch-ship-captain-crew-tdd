package edu.wctc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RollTest {
    @Test
    public void canCreateRollWithDice() {
        Roll roll = new Roll(5);
        assertEquals(5, roll.getDiceCount(), "Roll should be initialized with X Die objects");
    }
}
