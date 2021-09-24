package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class BoardTest {

    @Test
    public void testGetCellNewStateGiven0NeighborShouldReturnFalse() {
        Cell cell = new Cell(true, 0);

        assertFalse(cell.getNewState());
    }
}
