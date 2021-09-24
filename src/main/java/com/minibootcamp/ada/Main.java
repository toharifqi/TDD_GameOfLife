package com.minibootcamp.ada;

class Cell {
    int aliveNeighbors;

    public Cell(boolean currentState, int aliveNeighbors) {
        this.aliveNeighbors = aliveNeighbors;
    }

    public boolean getNewState() {

        if (aliveNeighbors < 2) {
            return false;
        }

        if (aliveNeighbors > 3) {
            return false;
        }

        return true;
    }
}

public class Main {
}
