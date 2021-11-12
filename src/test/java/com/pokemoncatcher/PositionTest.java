package com.pokemoncatcher;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void moveNorth() {
        // Given
        Position pos = new Position(0, 0);

        // When
        Position destination = pos.move(Direction.NORTH);

        // Then
        assertEquals(0, destination.x);
        assertEquals(1, destination.y);
    }

    @Test
    void moveSouth() {
        // Given
        Position pos = new Position(100, 100);

        // When
        Position destination = pos.move(Direction.SOUTH);

        // Then
        assertEquals(100, destination.x);
        assertEquals(99,destination.y);
    }

    @Test
    void moveEast() {
        // Given
        Position pos = new Position(100, 100);

        // When
        Position destination = pos.move(Direction.EAST);

        // Then
        assertEquals(101, destination.x);
        assertEquals(100,destination.y);
    }

    @Test
    void moveWest() {
        // Given
        Position pos = new Position(100, 100);

        // When
        Position destination = pos.move(Direction.WEST);

        // Then
        assertEquals(99, destination.x);
        assertEquals(100, destination.y);
    }


    @Test
    void testEquals() {
        // Given
        long x = new Random().nextLong();
        long y = new Random().nextLong();

        Position pos1 = new Position(x,y);
        Position pos2 = new Position(x,y);
        Position pos3 = new Position(x+1,y);

        // Then
        assertEquals(pos1, pos1);
        assertEquals(pos1, pos2);

        assertNotEquals(pos1, pos3);
        assertNotEquals(pos2, pos3);
    }
}