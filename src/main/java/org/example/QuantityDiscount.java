package org.example;

public class QuantityDiscount extends BaseDiscount {

        private final int minQuantity;
        private final double discount;

        public QuantityDiscount(Discount nextDiscount, int quantity, double discount) {
            super(nextDiscount);
            this.minQuantity = quantity;
            this.discount = discount;
        }

        @Override
        protected boolean isApplicable(Product product) {
            return product.quantity() >= minQuantity;
        }

        @Override
        protected double calculateDiscount(Product product) {
            return product.price() * discount;
        }

}
