package NullObjectDesignPattern.VehicleExample;

public class NullObject implements Vehicle {

    @Override
    public int getSeatCapacity() {
        return 0;
    }

    @Override
    public int getFuelCapacity() {
        return 0;
    }
    
}
