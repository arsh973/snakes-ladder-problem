package com.deserve.coding.problem.sl.service;

import com.deserve.coding.problem.sl.domain.Board;
import com.deserve.coding.problem.sl.domain.Snake;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SnakeAndLadderServiceTest {

    private static SnakeAndLadderService service;
    private static Board board;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Test Methods");
        List<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(14, 7));
        board = new Board(100, 0, snakeList);
        service = new SnakeAndLadderService(board);
    }

    @Test
    void playerPositionMovedInBoard() {
        board.setPlayerPosition(0);
        service.movePlayer(4);
        assertEquals(4, board.getPlayerPosition());
    }

    @Test
    void playerPositionShouldNotCrossBoard() {
        board.setPlayerPosition(98);
        service.movePlayer(4);
        assertEquals(98, board.getPlayerPosition());
    }

    @Test
    void playerBittenBySnake() {
        board.setPlayerPosition(12);
        service.movePlayer(2);
        assertEquals(7, board.getPlayerPosition());
    }
}