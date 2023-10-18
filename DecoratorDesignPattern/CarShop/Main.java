package DecoratorDesignPattern.CarShop;

import DecoratorDesignPattern.CarShop.BaseCars.BaseCars;
import DecoratorDesignPattern.CarShop.BaseCars.TataNexon;
import DecoratorDesignPattern.CarShop.Decorators.SeatCover;

public class Main {

    public static void main(String[] args){

        BaseCars car1 = new SeatCover(new TataNexon());

        System.out.println(car1.cost());
    } 
    
}
