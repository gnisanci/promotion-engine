package com.test.promotions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPromotionCandD {
    @Test
    public void testCalculateTotal_0C2D() {
        int result = PromotionCandD.calculateTotal(0,2);
        assertEquals(30, result);
    }

    @Test
    public void testCalculateTotal_2C0D() {
        int result = PromotionCandD.calculateTotal(2,0);
        assertEquals(40, result);
    }

    @Test
    public void testCalculateTotal_1C1D() {
        int result = PromotionCandD.calculateTotal(1,1);
        assertEquals(30, result);
    }

    @Test
    public void testCalculateTotal_1C2D() {
        int result = PromotionCandD.calculateTotal(1,2);
        assertEquals(45, result);
    }

    @Test
    public void testCalculateTotal_2C1D() {
        int result = PromotionCandD.calculateTotal(2,1);
        assertEquals(50, result);
    }
}
