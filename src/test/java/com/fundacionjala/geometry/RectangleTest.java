package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/16/2016.
 */
public class RectangleTest {

    private static final double BASE = 2;
    private static final double HIGH = 4;
    private Shape rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(BASE, HIGH);
    }

    @Test
    public void testCalculateRectanglePerimeter() {
        int expectedPerimeter = 12;
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), Constants.DELTA);
    }

    @Test
    public void testCalculateRectangleArea() {
        final double expectedValue = BASE * HIGH;
        assertEquals(expectedValue, rectangle.calculateArea(), Constants.DELTA);
    }
}
