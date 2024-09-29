package org.example;

public abstract class BaseDiscount implements Discount {


    private final Discount nextDiscount;

    protected BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    @Override
    public double apply(Product product) {
        double discount = 0.0;

        if (isApplicable(product)) {
            discount = calculateDiscount(product);
        }

        return discount += nextDiscount.apply(product);

    }

    @Override
    public String getDescription(Product product) {

        StringBuilder description = new StringBuilder();

        if (isApplicable(product)) {
            description.append("Applied: ").append(getClass().getSimpleName());
        }

        description.append(nextDiscount.getDescription(product));
        return description.toString();
    }


    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);
}
