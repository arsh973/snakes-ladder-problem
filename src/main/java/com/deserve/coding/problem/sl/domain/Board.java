package com.deserve.coding.problem.sl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Board {
    private int size;
    private int playerPosition; // Hashmap can be created for multiple players.
    private List<Snake> snakeList;
}
