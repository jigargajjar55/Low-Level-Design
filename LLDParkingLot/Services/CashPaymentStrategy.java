package LLDParkingLot.Services;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void paymentMode() {
        System.out.println("Paid in cash");
    }
}
