package StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.BasePizzas.BasePizza;

public class ExtraVeggies implements ToppingDecorator {

    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return (this.basePizza.cost() + 45);
    }
    
}
