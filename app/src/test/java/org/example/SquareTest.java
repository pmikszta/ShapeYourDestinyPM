package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SquareTest {

    // a bunch of straight forward tests
    @Test
    public void testGetArea() {
        Square square = new Square(5);
        assertEquals(25, square.getArea(), 0.0001); // 5*5 = 25
    }

    @Test
    public void testGetPerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.getPerimeter(), 0.0001); // 4*5 = 20
    }

    @Test
    public void testSetWidthHeight() {
        Square square = new Square(5);
        square.setWidth(7); // should update both width and height
        assertEquals(49, square.getArea(), 0.0001);
        assertEquals(28, square.getPerimeter(), 0.0001);

        square.setHeight(3); // should update both width and height
        assertEquals(9, square.getArea(), 0.0001);
        assertEquals(12, square.getPerimeter(), 0.0001);
    }

    @Test
    public void Testsides() {
        Square square = new Square(5);
        assertEquals(4, square.numberOfSides(), 0.0001);
    }

}
