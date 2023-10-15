package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    //Has a Relationship
    DriveStrategy driveObject;

    //Constructor Injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
    
}
