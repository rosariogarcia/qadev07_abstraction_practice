package com.fundacionjala.geometry;

/**
 * Created by RosarioGarcia on 6/16/2016.
 */
public class Circle implements Shape {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
