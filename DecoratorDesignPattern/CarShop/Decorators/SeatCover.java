package DecoratorDesignPattern.CarShop.Decorators;

import DecoratorDesignPattern.CarShop.BaseCars.BaseCars;

public class SeatCover extends FunctionalityDecorators {

    BaseCars baseCars;

    public SeatCover(BaseCars baseCars){
        this.baseCars = baseCars;
    }

    @Override
    public int cost(){

        return (this.baseCars.cost() + 30000);
    }
    
}
