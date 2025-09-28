package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {
     //Sinple Tests
    @Test
    public void testGetArea() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        assertEquals(12.5, triangle.getArea(), 0.0001); // 0.5 * 5 * 5 = 12.5
    }

    @Test
    public void testGetPerimeter() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        double expectedPerimeter = 5 + 5 + Math.sqrt(5*5 + 5*5); // 5 + 5 + 5√2
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }
}
