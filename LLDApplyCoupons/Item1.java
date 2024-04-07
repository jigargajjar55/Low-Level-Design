package LLDApplyCoupons;

public class Item1 implements Product {

    String name;
    double originalPrice;
    ProductType type;

    public Item1(String name, double originalPrice, ProductType type) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.type = type;
    }

    @Override
    public double getPrice() {

        return originalPrice;

    }

    public ProductType getType() {

        return type;

    }

}
