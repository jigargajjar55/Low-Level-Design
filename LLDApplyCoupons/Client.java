package LLDApplyCoupons;

public class Client {
    
    public static void main(String[] args) {
        
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONICS);
        Product item2 = new Item2("SOFA",1000, ProductType.FURNITURE);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1,ProductType.ELECTRONICS);
        cart.addToCart(item2,ProductType.FURNITURE);

        System.out.println("Total price after discount: "+ cart.getTotalPrice());
    }
}
