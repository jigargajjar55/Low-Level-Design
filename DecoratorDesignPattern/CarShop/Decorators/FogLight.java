package DecoratorDesignPattern.CarShop.Decorators;

import DecoratorDesignPattern.CarShop.BaseCars.BaseCars;

public class FogLight extends FunctionalityDecorators {

    BaseCars baseCars;

    public FogLight(BaseCars baseCars){
        this.baseCars = baseCars;
    }

    @Override
    public int cost(){
        return (this.baseCars.cost() + 46000);
    }
    
}
