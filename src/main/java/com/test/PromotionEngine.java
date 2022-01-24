package com.test;

import java.util.Scanner;

public class PromotionEngine {

    public static void main(String[] args) {
        CartCalculator calc = new CartCalculator();
        Scanner sc = new Scanner(System.in);

        int quantityA = getSkuQuantity("A", sc);
        int quantityB = getSkuQuantity("B", sc);
        int quantityC = getSkuQuantity("C", sc);
        int quantityD = getSkuQuantity("D", sc);

        int total = calc.calculateTotal(quantityA, quantityB, quantityC, quantityD);
        System.out.println("Cart Total = " + total + "\n");
    }

    private static int getSkuQuantity(String skuType, Scanner sc) {
        System.out.print("SKU " + skuType + " quantity: ");
        int skuQuantity = sc.nextInt();
        System.out.println();
        return skuQuantity;
    }

}
