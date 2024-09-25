package org.example;

public class DummyDiscount implements Discount {

    @Override
    public double apply(Product product) {
        return 0;
    }

    @Override
    public String getDescription(Product product) {
        return "";
    }

}
