package com.fundacionjala.geometry;

/**
 * Created by RosarioGarcia on 6/16/2016.
 */
public class Rectangle implements Shape {
    private double base;
    private double high;

    public Rectangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    public double calculateArea() {
        return base * high;
    }

    public double calculatePerimeter() {
        return 2 * base + 2 * high;
    }
}
