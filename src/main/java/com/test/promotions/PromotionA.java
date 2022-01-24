package com.test.promotions;

public class PromotionA {
    private static final int PRICE_SKUA = 50;
    private static final int PRICE_3X_SKUA = 130;

    public static int calculateTotal(int quantity) {
        int total = 0;

        if (quantity >= 3) {
            int quotient = quantity / 3;
            int remainder = quantity % 3;

            if (quotient >= 0) {
                total = quotient * PRICE_3X_SKUA;
            }

            if (remainder >= 0) {
                total += remainder * PRICE_SKUA;
            }

            return total;
        }

        return quantity * PRICE_SKUA;
    }
}
