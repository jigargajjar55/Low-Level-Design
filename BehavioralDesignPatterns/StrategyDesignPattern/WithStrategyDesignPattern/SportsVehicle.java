package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){

        super(new SpecialDriveStrategy());
    }


    
}
