package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    //Simple Tests
    @Test
    public void testGetArea() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6, triangle.getArea(), 0.0001); // 0.5 * 3 * 4 = 6
    }

    @Test
    public void testGetPerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(12, triangle.getPerimeter(), 0.0001); // 3 + 4 + 5 = 12
    }
}
