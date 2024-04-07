package LLDApplyCoupons;

import java.util.*;

import LLDApplyCoupons.Decorator.PercentageCouponDecorator;
import LLDApplyCoupons.Decorator.TypeCouponDecorator;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product, ProductType type) {

        Product productWithEligbleDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product, 10), 20,
                type);

        productList.add(productWithEligbleDiscount);

    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Product product : productList) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

}
