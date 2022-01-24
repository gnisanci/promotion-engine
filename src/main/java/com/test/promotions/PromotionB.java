package com.test.promotions;

public class PromotionB {
    private static final int PRICE_SKUB = 30;
    private static final int PRICE_2X_SKUB = 45;

    public static int calculateTotal(int quantity) {
        int total = 0;

        if (quantity >= 2) {
            int quotient = quantity / 2;
            int remainder = quantity % 2;

            total = (quotient >= 0) ? quotient * PRICE_2X_SKUB : total;
            total = (remainder >= 0) ? total + remainder * PRICE_SKUB : total;
            return total;
        }

        return quantity * PRICE_SKUB;
    }
}
