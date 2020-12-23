package com.deserve.coding.problem.sl.service;

import com.deserve.coding.problem.sl.domain.Board;
import com.deserve.coding.problem.sl.domain.Snake;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SnakeAndLadderService {

    private Board board;

    public void movePlayer(int positions) {
        int oldPosition = board.getPlayerPosition();
        int newPosition = oldPosition + positions;
        int boardSize = board.getSize();
        if(newPosition > boardSize) newPosition = oldPosition;
        else newPosition = getNewPositionWithSnakes(newPosition);
        board.setPlayerPosition(newPosition);
        System.out.println("Player rolled a dice facing " + positions + " and moves from " + oldPosition + " to " + newPosition);
    }

    private int getNewPositionWithSnakes(int newPositionAfterRoll) {
        int prevPosition;
        do {
            prevPosition = newPositionAfterRoll;
            for(Snake snake : board.getSnakeList()){
                if(snake.getStartPosition() == newPositionAfterRoll) newPositionAfterRoll = snake.getEndPosition();
            }
        } while (prevPosition != newPositionAfterRoll);
        return newPositionAfterRoll;
    }

}
