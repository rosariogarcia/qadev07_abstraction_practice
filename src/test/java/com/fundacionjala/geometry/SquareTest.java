package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Square}
 *
 * @author Rosario Garcia
 */
public class SquareTest {

    private static final double SIDE = 2;
    private Shape square;

    @Before
    public void setUp() {
        square = new Square(SIDE);
    }

    @Test
    public void testCalculateSquareArea() {
        final int expectedArea = 4;
        assertEquals("Area is not equal", expectedArea, square.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculateSquarePerimeter() {
        final int expectedPerimeter = 8;
        assertEquals("Perimeter is not equal", expectedPerimeter, square.calculatePerimeter(), Constants.DELTA);
    }
}
