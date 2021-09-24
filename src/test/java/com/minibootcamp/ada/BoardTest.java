package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoardTest {

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
}
