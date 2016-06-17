package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/16/2016.
 */
public class CircleTest {

    private static double radio = 2;
    private Shape circle;

    @Before
    public void serUp() {
        circle = new Circle(radio);
    }

    @Test
    public void testCalculateCircleArea() {
        double expectedArea = Math.PI * Math.pow(radio, 2);
        assertEquals(expectedArea, circle.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculateCirclePerimeter() {
        double expectedPerimeter = 2 * radio * Math.PI;
        assertEquals(expectedPerimeter, circle.calculatePerimeter(), Constants.DELTA);
    }

    @Test
    public void testCalculateAreaWhenRadioIsZero() {
        circle = new Circle(0);
        int expectedValue = 0;
        assertEquals(expectedValue, circle.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculatePerimeterWhenRadioIsZeroShouldBePI() {
        circle = new Circle(0);
        int expectedValue = 0;
        assertEquals(expectedValue, circle.calculatePerimeter(), Constants.DELTA);
    }
}
