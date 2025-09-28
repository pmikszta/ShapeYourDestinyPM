package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircleTest {
    //simple tests
    @Test
    public void testGetArea() {
        Circle circle = new Circle(7);
        assertEquals(Math.PI * 7 * 7, circle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(7);
        assertEquals(2 * Math.PI * 7, circle.getPerimeter(), 0.0001);
    }
}
