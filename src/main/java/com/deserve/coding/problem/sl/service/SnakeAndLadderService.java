package com.deserve.coding.problem.sl.service;

import com.deserve.coding.problem.sl.domain.Board;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SnakeAndLadderService {

    private Board board;


    public void movePlayer(int positions) {
        int oldPosition = board.getPlayerPosition();
        int newPosition = oldPosition + positions;

        int boardSize = board.getSize();

        if(newPosition > boardSize) newPosition = oldPosition;
        board.setPlayerPosition(newPosition);
        System.out.println("Player rolled a dice facing " + positions + " and moves from " + oldPosition + " to " + newPosition);
    }

}
