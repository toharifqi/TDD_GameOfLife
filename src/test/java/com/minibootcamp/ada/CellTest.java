package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CellTest {

    @Test
    public void testGetCellNewStateGiven0NeighborShouldReturnFalse() {
        Cell cell = new Cell(true, 0);

        assertFalse(cell.getNewState());
    }

    @Test
    public void testGetCellNewStateGiven1NeighborShouldReturnFalse() {
        Cell cell = new Cell(true, 1);

        assertFalse(cell.getNewState());
    }

    @Test
    public void testGetCellNewStateGiven2Or3NeighborShouldReturnTrue() {
        Cell cell = new Cell(true, 3);

        assertTrue(cell.getNewState());
    }

    @Test
    public void testGetCellNewStateGivenMore3NeighborShouldReturnFalse() {
        Cell cell = new Cell(true, 4);

        assertFalse(cell.getNewState());
    }

    @Test
    public void testGetCellNewStateGivenDeadAnd2NeighborShouldReturnFalse() {
        Cell cell = new Cell(false, 2);

        assertFalse(cell.getNewState());
    }

    @Test
    public void testGetCellNewStateGivenDeadAnd3NeighborShouldReturnTrue() {
        Cell cell = new Cell(false, 3);

        assertTrue(cell.getNewState());
    }
}
