package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product cheese = new Product("Ost", 6.5, 2);
        Product milk = new Product("Mjölk", 5.5, 1);
        Product bread = new Product("Bröd", 176.0, 5);

        Discount allDiscounts = new FridayDiscount(
                new MilkDiscount(
                        new QuantityDiscount(
                                new DummyDiscount(), 5, 5)));

        applyDiscount(cheese, allDiscounts);
        applyDiscount(milk, allDiscounts);
        applyDiscount(bread, allDiscounts);
    }

    private static void applyDiscount(Product product, Discount discount) {

        double discountAmount = discount.apply(product);
        String description = discount.getDescription(product);

        if (description.isBlank()) {
            description = "No discount applied";
        }

        System.out.println(product.name() + " - "
                + product.price() +
                " kr - Discount: " +
                discountAmount + " kr - " +
                description);
    }
}