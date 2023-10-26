package StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem;

import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.BasePizzas.BasePizza;
import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.BasePizzas.Margherita;
import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.Decorators.ExtraCheese;
import StructuralDesignPatterns.DecoratorDesignPattern.PizzaOrderingSystem.Decorators.ExtraVeggies;

//Decorator Design Pattern

//We have base object with certain feature.
//If we have to add additional feature, we can add onto object and create new object.

//Why do you need Decorator Design Pattern?

//When we have Base Class is prepared, other functionality will be in combinations to work for requirements. 
//So we used Decorator Design Pattern to avoid Class Explosion. 

public class Main{

    public static void main(String[] args){

        BasePizza pizza1 = new ExtraCheese(new Margherita());

        System.out.println("Cost of Pizza 1: " + pizza1.cost());

        BasePizza pizza2 = new ExtraVeggies(new ExtraCheese(new Margherita()));

        System.out.println("Cost of Pizza 2: " + pizza2.cost());

    }
}