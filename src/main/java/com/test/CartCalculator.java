package com.test;

import com.test.promotions.PromotionA;
import com.test.promotions.PromotionB;
import com.test.promotions.PromotionCandD;

public class CartCalculator {
    public int calculateTotal(int quantityA, int quantityB, int quantityC, int quantityD) {
        int total = 0;

        total += PromotionA.calculateTotal(quantityA);
        total += PromotionB.calculateTotal(quantityB);
        total += PromotionCandD.calculateTotal(quantityC, quantityD);

        return total;
    }
}
