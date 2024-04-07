package LLDApplyCoupons.Decorator;

import java.util.*;

import LLDApplyCoupons.Product;
import LLDApplyCoupons.ProductType;

public class TypeCouponDecorator extends CouponDecorator {

    Product product;
    double discountPercentage;
    ProductType type;

    static List<ProductType> eligibleTypes = new ArrayList<>();
    static {
        eligibleTypes.add(ProductType.ELECTRONICS);
        eligibleTypes.add(ProductType.CLOTHES);
    }

    public TypeCouponDecorator(Product product, double discountPercentage, ProductType type) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.type = type;
    }

    @Override
    public double getPrice() {

        double price = product.getPrice();

        if (eligibleTypes.contains(type)) {
            price = price - ((price * discountPercentage) / 100);
        }

        return price;

    }

}
