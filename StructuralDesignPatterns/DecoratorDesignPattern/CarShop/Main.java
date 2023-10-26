package StructuralDesignPatterns.DecoratorDesignPattern.CarShop;

import StructuralDesignPatterns.DecoratorDesignPattern.CarShop.BaseCars.BaseCars;
import StructuralDesignPatterns.DecoratorDesignPattern.CarShop.BaseCars.TataNexon;
import StructuralDesignPatterns.DecoratorDesignPattern.CarShop.Decorators.SeatCover;

public class Main {

    public static void main(String[] args){

        BaseCars car1 = new SeatCover(new TataNexon());

        System.out.println(car1.cost());
    } 
    
}
