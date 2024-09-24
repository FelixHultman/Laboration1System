package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Ost", 50, 10);


        Discount discount = new FridayDiscount(null);


        LocalDate today = LocalDate.now();
        double totalDiscount = discount.apply(product);
        System.out.println("Total rabatt: " + totalDiscount + " kronor");


        String description = discount.getDescription(product);
        System.out.println(description);
    }

}