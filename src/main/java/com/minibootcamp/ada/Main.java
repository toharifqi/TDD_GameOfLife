package com.minibootcamp.ada;

class Cell {
    int aliveNeighbors;
    boolean currentState;

    public Cell(boolean currentState, int aliveNeighbors) {
        this.aliveNeighbors = aliveNeighbors;
        this.currentState = currentState;
    }

    public boolean getNewState() {

        if (currentState) {

            if (aliveNeighbors < 2) {
                return false;
            }

            if (aliveNeighbors > 3) {
                return false;
            }
        } else {

            if (aliveNeighbors == 3) {
                return true;
            }

            return false;
        }

        return true;
    }
}

public class Main {
}
