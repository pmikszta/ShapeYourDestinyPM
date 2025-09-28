package org.example;

public class IsoscelesRightTriangle extends RightTriangle implements Polygon {

    // modified constructors since only one side matters
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg); 
    }
 
    @Override
    public int numberOfSides() {
        return 3;
    }

}
