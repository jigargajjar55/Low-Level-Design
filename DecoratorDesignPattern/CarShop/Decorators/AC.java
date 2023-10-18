package DecoratorDesignPattern.CarShop.Decorators;

import DecoratorDesignPattern.CarShop.BaseCars.BaseCars;

public class AC extends FunctionalityDecorators{

    BaseCars baseCars;

    public AC(BaseCars baseCars){
        this.baseCars = baseCars;
    }

    @Override
    public int cost(){

        return (this.baseCars.cost() + 20000);
    }
    
}
