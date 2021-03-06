package com.fundacionjala.geometry;

/**
 * Interface to define methods to calculate area and perimeter of a geometry shape
 *
 * @author Rosario Garcia
 */
public interface Shape {

    /**
     * This method is used to calculate area of a geometry shape
     */
    double calculateArea();

    /**
     * This method is used to calculate perimeter of a geometry shape
     */
    double calculatePerimeter();

}
