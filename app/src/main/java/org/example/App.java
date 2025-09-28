package org.example;

public class App {
    public static void main(String[] args) {
        // Create an object of each class and write everything to the sceen
        System.out.println("\n------------------------------------- \n");
        System.out.println("writing all objects to the screen \n");
        System.out.println("\n------------------------------------- \n");

        Rectangle rect = new Rectangle(10, 8);

        System.out.println("Rectangle");
        System.out.println("Rectangle Dimensions: " + rect.getWidth() + " x " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Number of Sides: " + rect.numberOfSides());
        System.out.println("\n------------------------------------- \n");



        Square square = new Square(8);

        System.out.println("Square");
        System.out.println("Rectangle Dimensions: " + square.getWidth() + " x " + square.getHeight());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Number of Sides: " + square.numberOfSides());
        System.out.println("\n------------------------------------- \n");

        RightTriangle triangle = new RightTriangle(3, 4);

        System.out.println("Right Triangle:");
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Number of Sides: " + triangle.numberOfSides());
        System.out.println("\n------------------------------------- \n");

        IsoscelesRightTriangle isotriangle = new IsoscelesRightTriangle(4);

        System.out.println("Isosceles Right Triangle:");
        System.out.println("Base: " + isotriangle.getBase());
        System.out.println("Height: " + isotriangle.getHeight());
        System.out.println("Area: " + isotriangle.getArea());
        System.out.println("Perimeter: " + isotriangle.getPerimeter());
        System.out.println("Number of Sides: " + isotriangle.numberOfSides());
        System.out.println("\n------------------------------------- \n");

        Circle circle = new Circle(4);

        System.out.println("Circle");
        System.out.println("Radius: " + circle.getradius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Number of Sides: " + circle.numberOfSides());
        System.out.println("\n------------------------------------- \n");

        //
        System.out.println("Good Bye");
        System.out.println("\n------------------------------------- \n");
    }
}
