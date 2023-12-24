package LLDParkingLot.Services;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public double getPrice(double slotPrice, long timeDifference) {
        return slotPrice * (timeDifference * 1.0) * 20;
    }
}
