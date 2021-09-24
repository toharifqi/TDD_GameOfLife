package com.minibootcamp.ada;

class Cell {
    int aliveNeighbors;
    boolean currentState;

    public Cell(boolean currentState, int aliveNeighbors) {
        this.aliveNeighbors = aliveNeighbors;
        this.currentState = currentState;
    }

    public boolean getNewState() {

        if (currentState){

            return aliveNeighbors >= 2 && aliveNeighbors <= 3;
        }else {

            return aliveNeighbors == 3;
        }
    }
}

public class Main {
}
