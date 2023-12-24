package LLDParkingLot.Services;



public interface PricingStrategy {
    public double getPrice(double slotPrice, long timeDifference);
}
