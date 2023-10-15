package StrategyDesignPattern.WithoutStrategyDesignPattern;

//Multiple Child class overriding method of Parent class and having code duplication in our Code-base 
public class Vehicle {

    public void drive(){
        System.out.println("Normal drive capability");
    }
    
}
