package com.deserve.coding.problem.sl.service;

import com.deserve.coding.problem.sl.domain.Board;
import com.deserve.coding.problem.sl.domain.Snake;

import java.util.ArrayList;
import java.util.List;

public class GameStarter {

    private static final int DEFAULT_BOARD_SIZE = 100;
    private static final int DEFAULT_PLAYER_POSITION = 0;

    /*
    * Game can be started with any dice crooked or not
    * */
    public static void main(String[] args) {
        List<Snake> snakes = createSnakes();
        SnakeAndLadderService service = new SnakeAndLadderService(new Board(DEFAULT_BOARD_SIZE, DEFAULT_PLAYER_POSITION, snakes));
        for(int i =0; i<9 ; i++) {
            //int diceValue = DiceService.rollFairDice();
            int diceValue = DiceService.rollCrookedDice();
            service.movePlayer(diceValue);
        }
    }

    private static List<Snake> createSnakes() {
        List<Snake> snakes = new ArrayList<>();
        Snake snake = new Snake(14, 7);
        snakes.add(snake);
        return snakes;
    }
}
