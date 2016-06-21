package com.fundacionjala.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * @author Rosario Garcia
 * Class to calculate area and perimeter of Circle
 */
public class Circle implements Shape {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return PI * pow(radio, Constants.FACTOR_FORMULA);
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return Constants.FACTOR_FORMULA * PI * radio;
    }
}
