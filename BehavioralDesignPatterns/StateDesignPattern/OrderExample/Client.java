package StateDesignPattern.OrderExample;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        
        order.paymentSuccessful();
        order.cancel();
        
        order.dispatched();
        
        
    }
}
