package org.example;

import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount {

    public FridayDiscount(Discount nextDiscount)
    {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return LocalDate.now().getDayOfWeek().getValue() == 5;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.price() * 0.1;
    }

}
