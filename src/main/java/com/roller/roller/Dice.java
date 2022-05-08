package com.roller.roller;
import java.util.Random;
import java.util.Set;

public class Dice {
    static Random rand = new Random();

    int type;
    public Dice(String t) throws Exception {
        if (!Set.of("d4", "d6", "d8", "d10", "d12", "d20", "d100").contains(t))
            throw new Exception("Invalid dice type");
        type = Integer.parseInt(t.substring(1));
    }

    public Integer roll()
    {
        return rand.nextInt(type - 1) + 1;
    }
}
