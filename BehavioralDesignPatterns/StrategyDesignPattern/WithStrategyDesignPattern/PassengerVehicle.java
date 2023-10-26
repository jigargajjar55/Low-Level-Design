package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
    
}
