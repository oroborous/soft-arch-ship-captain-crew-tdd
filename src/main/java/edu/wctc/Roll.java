package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Roll {
    public List<Die> dice = new ArrayList<>();
    public Roll(int diceCount) {
        for (int i = 0; i < diceCount; i++) {
            dice.add(new Die());
        }
    }

    public int getDiceCount() {
        return dice.size();
    }
}
