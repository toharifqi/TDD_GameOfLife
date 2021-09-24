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

class Board {
    int boardWidth;
    int boardHeight;

    Cell[][] cellDistribution;

    public Board(Cell[][] cellDistribution) {
        this.cellDistribution = cellDistribution;
        this.boardWidth = cellDistribution.length;
        this.boardHeight = cellDistribution[0].length;

        for (int y = 0; y < this.boardWidth; y++) {
            for (int x = 0; x < this.boardHeight; x++) {
                this.cellDistribution[x][y] = new Cell(false, 0);
            }
        }
    }

    public void drawBoard() {
        for (int y = 0; y < boardWidth + 2; y++) {
            StringBuilder line = new StringBuilder();
            if (y == 0 || y == boardHeight + 1){
                line.append(" = ".repeat(Math.max(0, boardWidth + 2)));
            }else {
                for (int x = 0; x < boardWidth + 2; x++) {
                    if (x == 0 || x == boardWidth + 1){
                        line.append(" | ");
                    }
                    else {
                        if (!cellDistribution[x - 1][y - 1].currentState){
                            line.append(" . ");
                        }else {
                            line.append(" # ");
                        }
                    }
                }
            }
            System.out.println(line);
        }
        System.out.print("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Cell[][] cellDistribution = new Cell[5][5];
        Board board = new Board(cellDistribution);

        board.cellDistribution[1][2].currentState = true;
        board.cellDistribution[2][2].currentState = true;
        board.cellDistribution[3][2].currentState = true;

        board.drawBoard();


    }
}
