package com.test;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestCartCalculator {
    private CartCalculator cartCalculator;

    @Before
    public void init(){
        cartCalculator = new CartCalculator();
    }

    @Test
    public void testCalculateTotal_1A1B1C0D() {
        int result = cartCalculator.calculateTotal(1, 1, 1, 0);
        assertEquals(100, result);
    }

    @Test
    public void testCalculateTotal_1A1B1C1D() {
        int result = cartCalculator.calculateTotal(1, 1, 1, 1);
        assertEquals(110, result);
    }

    @Test
    public void testCalculateTotal_5A5B1C0D() {
        int result = cartCalculator.calculateTotal(5, 5, 1, 0);
        assertEquals(370, result);
    }

    @Test
    public void testCalculateTotal_3A5B1C1D() {
        int result = cartCalculator.calculateTotal(3, 5, 1, 1);
        assertEquals(280, result);
    }

}
