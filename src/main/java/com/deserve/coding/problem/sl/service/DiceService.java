package com.deserve.coding.problem.sl.service;

import java.util.Random;

public class DiceService {

    public static int rollFairDice() {
        return new Random().nextInt(6) + 1;
    }

    /*
    * Rolls only even numbers of a dice.
    * */
    public static int rollCrookedDice() {
        int diceValue = new Random().nextInt(6) + 1;
        if(diceValue%2 != 0) return diceValue + 1;
        else return diceValue;
    }
}
