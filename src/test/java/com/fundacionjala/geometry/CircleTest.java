package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Circle}
 *
 * @author Rosario Garcia
 */
public class CircleTest {

    private static final int RADIO_ZERO = 0;
    private static final double RADIO = 2;
    private Shape circle;

    @Before
    public void setUp() {
        circle = new Circle(RADIO);
    }

    @Test
    public void testCalculateCircleArea() {
        final double expectedArea = PI * pow(RADIO, Constants.FACTOR_FORMULA);
        assertEquals("Area is not equal", expectedArea, circle.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculateCirclePerimeter() {
        final double expectedPerimeter = Constants.FACTOR_FORMULA * RADIO * PI;
        assertEquals("Perimeter is not equal", expectedPerimeter, circle.calculatePerimeter(), Constants.DELTA);
    }

    @Test
    public void testCalculateAreaWhenRadioIsZero() {
        circle = new Circle(RADIO_ZERO);
        final int expectedValue = 0;
        assertEquals("Area is not zero", expectedValue, circle.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculatePerimeterWhenRadioIsZeroShouldBePI() {
        circle = new Circle(RADIO_ZERO);
        final int expectedValue = 0;
        assertEquals("Perimeter is not zero", expectedValue, circle.calculatePerimeter(), Constants.DELTA);
    }
}
