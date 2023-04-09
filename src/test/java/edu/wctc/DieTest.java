package edu.wctc;

import org.junit.jupiter.api.Test;

public class DieTest {
    @Test
    public void canRollDie() {
        Die die = new Die();
        die.roll();
    }
    
}
