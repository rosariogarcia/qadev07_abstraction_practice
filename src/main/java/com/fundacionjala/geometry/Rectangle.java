package com.fundacionjala.geometry;

/**
 * Class to calculate area and perimeter of Rectangle
 *
 * @author Rosario Garcia
 */
public class Rectangle implements Shape {

    private double base;
    private double high;

    public Rectangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return base * high;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return Constants.FACTOR_FORMULA * (base + high);
    }
}
