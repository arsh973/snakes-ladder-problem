package com.deserve.coding.problem.sl.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceServiceTest {

    @Test
    void rollOnlyEvenNumbers() {
        int diceValue = DiceService.rollCrookedDice();
        assertEquals(0, diceValue%2);
    }
}