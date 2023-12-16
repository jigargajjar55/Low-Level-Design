package StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.BasePizzas.BasePizza;


public class ExtraCheese implements ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza; 
    }

    @Override
    public int cost(){
        return (this.basePizza.cost() + 30);
    }
    
}
