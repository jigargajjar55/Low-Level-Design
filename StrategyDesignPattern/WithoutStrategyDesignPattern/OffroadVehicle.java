package StrategyDesignPattern.WithoutStrategyDesignPattern;

public class OffroadVehicle extends Vehicle {
    
    @Override
    public void drive() {
        System.out.println("Special Capability");
    }
}
