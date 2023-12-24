package LLDParkingLot.Services;



public class MinutePricingStrategy implements PricingStrategy {
    @Override
    public double getPrice(double slotPrice, long timeDifference) {
        return slotPrice * (timeDifference * 1.0) * 0.5;
    }
}
