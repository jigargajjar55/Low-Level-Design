package LLDApplyCoupons.Decorator;

import LLDApplyCoupons.Product;


public class PercentageCouponDecorator implements CouponDecorator {

    Product product;
    double discountPercentage;

    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {

        double price = product.getPrice();

        price = price - ((price * discountPercentage) / 100);

        return price;

    }

}
