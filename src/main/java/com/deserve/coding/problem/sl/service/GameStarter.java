package com.deserve.coding.problem.sl.service;

import com.deserve.coding.problem.sl.domain.Board;

public class GameStarter {

    private static final int DEFAULT_BOARD_SIZE = 100;
    private static final int DEFAULT_PLAYER_POSITION = 0;

    public static void main(String[] args) {
        SnakeAndLadderService service = new SnakeAndLadderService(new Board(DEFAULT_BOARD_SIZE, DEFAULT_PLAYER_POSITION));
        for(int i =0; i<9 ; i++) {
            int diceValue = DiceService.rollFairDice();
            service.movePlayer(diceValue);
        }
    }
}
