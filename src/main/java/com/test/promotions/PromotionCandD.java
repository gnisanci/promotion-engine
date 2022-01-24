package com.test.promotions;

public class PromotionCandD {
    private static final int PRICE_SKUC = 20;
    private static final int PRICE_SKUD = 15;
    private static final int PRICE_1X_SKUC_AND_1X_SKUD = 30;

    public static int calculateTotal(int quantityC, int quantityD) {

        if (quantityC >= 1 && quantityD >= 1) {
            if (quantityC == quantityD){
                return quantityC * PRICE_1X_SKUC_AND_1X_SKUD;
            } else if (quantityC > quantityD) {
                return quantityD * PRICE_1X_SKUC_AND_1X_SKUD + (quantityC - quantityD) * PRICE_SKUC;
            } else {
                return quantityC * PRICE_1X_SKUC_AND_1X_SKUD + (quantityD - quantityC) * PRICE_SKUD;
            }
        }

        return quantityC * PRICE_SKUC + quantityD * PRICE_SKUD;
    }
}
