package org.example;

//Variables 
public class RightTriangle extends Shape implements Polygon {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Overrides
    @Override
    public double getArea() {
         return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
         double hypotenuse = Math.sqrt(base * base + height * height);
         return base + height + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle(3, 4);
         System.out.println("RightTriangle Area: " + triangle.getArea());
         System.out.println("RightTriangle Perimeter: " + triangle.getPerimeter());
    }
    
}
