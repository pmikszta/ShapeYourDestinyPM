package org.example;


public class Rectangle extends Shape {

    //Private Varibales
    private double width;
     private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //Overrides from Shape
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
         return 2 * (width + height);
    }

    // gettors and setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
         this.height = height;
    }

    public double getWidth() { return width; }

    public double getHeight() { return height; }
}
