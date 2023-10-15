package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
    
}
