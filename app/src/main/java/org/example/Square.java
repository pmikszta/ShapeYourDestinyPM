package org.example;

public class Square extends Rectangle {

    // Constructor
    public Square(double side) {
        super(side, side); // Call Rectangle constructor with equal width and height
    }

    // Overrides
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

}
