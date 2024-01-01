package NullObjectDesignPattern.VehicleExample;

public class Bike implements Vehicle {

    @Override
    public int getSeatCapacity() {
        return 2;
    }

    @Override
    public int getFuelCapacity() {
        return 10;
    }
    
}
