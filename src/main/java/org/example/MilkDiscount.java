package org.example;

public class MilkDiscount extends BaseDiscount {

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.name().equals("Milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price() * 0.5;
    }


}
