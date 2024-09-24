package org.example;

public class QuantityDiscount extends BaseDiscount {

        private final int minQuantity;


        public QuantityDiscount(Discount nextDiscount, int quantity) {
            super(nextDiscount);
            this.minQuantity = quantity;

        }

        @Override
        protected boolean isApplicable(Product product) {
            return product.quantity() >= minQuantity;
        }

        @Override
        protected double calculateDiscount(Product product) {
            return product.price() * 0.8;
        }

}
