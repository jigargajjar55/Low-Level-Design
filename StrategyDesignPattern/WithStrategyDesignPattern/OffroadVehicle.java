package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle {

    OffroadVehicle(){
        super(new SpecialDriveStrategy());
    }
    
}
