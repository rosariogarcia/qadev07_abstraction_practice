package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Rosario Garcia
 * Tests for {@link Rectangle}
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
        assertEquals("Perimeter is not equal", expectedPerimeter, rectangle.calculatePerimeter(), Constants.DELTA);
    }

    @Test
    public void testCalculateRectangleArea() {
        final double expectedValue = BASE * HIGH;
        assertEquals("Area is not equal", expectedValue, rectangle.calculateArea(), Constants.DELTA);
    }
}
