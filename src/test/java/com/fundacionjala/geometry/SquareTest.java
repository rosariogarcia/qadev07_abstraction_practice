package com.fundacionjala.geometry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/16/2016.
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
        int expectedArea = 4;
        assertEquals(expectedArea, square.calculateArea(), Constants.DELTA);
    }

    @Test
    public void testCalculateSquarePerimeter() {
        int expectedPerimeter = 8;
        assertEquals(expectedPerimeter, square.calculatePerimeter(), Constants.DELTA);
    }
}
