package com.test.promotions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPromotionB {
    @Test
    public void testCalculateTotal_1B() {
        int result = PromotionB.calculateTotal(1);
        assertEquals(30, result);
    }

    @Test
    public void testCalculateTotal_2B() {
        int result = PromotionB.calculateTotal(3);
        assertEquals(75, result);
    }

    @Test
    public void testCalculateTotal_5B() {
        int result = PromotionB.calculateTotal(5);
        assertEquals(120, result);
    }
}
