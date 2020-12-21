package com.deserve.coding.problem.sl.service;

import java.util.Random;

public class DiceService {

    public static int rollFairDice() {
        return new Random().nextInt(6) + 1;
    }
}
