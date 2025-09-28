package org.example;

public class Square extends Rectangle implements Polygon {

    // Constructor
    public Square(double side) {
        super(side, side); 
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

    @Override
    public int numberOfSides() {
        return 4;
    }

}
