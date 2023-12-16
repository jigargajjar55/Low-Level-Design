package StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.BasePizzas.BasePizza;

public class Mushroom implements ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return (this.basePizza.cost() + 35);
    }
    
}
