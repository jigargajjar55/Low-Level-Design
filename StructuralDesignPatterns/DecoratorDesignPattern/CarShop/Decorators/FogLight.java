package StructuralDesignPatterns.DecoratorDesignPattern.CarShop.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.CarShop.BaseCars.BaseCars;

public class FogLight implements FunctionalityDecorators {

    BaseCars baseCars;

    public FogLight(BaseCars baseCars){
        this.baseCars = baseCars;
    }

    @Override
    public int cost(){
        return (this.baseCars.cost() + 46000);
    }
    
}
