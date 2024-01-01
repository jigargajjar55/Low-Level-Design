package NullObjectDesignPattern.VehicleExample;

public class Car implements Vehicle {

    @Override
    public int getSeatCapacity() {
        return 4;
    }

    @Override
    public int getFuelCapacity() {
       return 50;
    }
    
}
