package org.example;

public class IsoscelesRightTriangle extends RightTriangle {

    // Constructor: only one leg needed
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }

    // Overrides
    @Override
    public void setBase(double leg) {
        super.setBase(leg);
        super.setHeight(leg);
    }

    @Override
    public void setHeight(double leg) {
        super.setBase(leg);
        super.setHeight(leg);
    }

}
