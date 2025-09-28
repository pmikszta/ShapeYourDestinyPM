package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    //Simple Tests
    @Test
    public void testGetArea() {
        Rectangle rect = new Rectangle(20, 10);
        assertEquals(200, rect.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter(), 0.0001);
    }
}
