package com.test.promotions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPromotionA {
    @Test
    public void testCalculateTotal_1A() {
        int result = PromotionA.calculateTotal(1);
        assertEquals(50, result);
    }

    @Test
    public void testCalculateTotal_3A() {
        int result = PromotionA.calculateTotal(3);
        assertEquals(130, result);
    }

    @Test
    public void testCalculateTotal_5A() {
        int result = PromotionA.calculateTotal(5);
        assertEquals(230, result);
    }

}
