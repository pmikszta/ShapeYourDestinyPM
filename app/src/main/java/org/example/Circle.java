package org.example;

// Private Variables
public class Circle extends Shape {
     private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    //Overrides from Shape
    @Override
    public double getArea() {
         return Math.PI * radius * radius;
    }

    @Override
     public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


}
