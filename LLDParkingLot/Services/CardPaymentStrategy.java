package LLDParkingLot.Services;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void paymentMode() {
        System.out.println("Paid via card");
    }
}
