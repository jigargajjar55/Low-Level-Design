package StrategyDesignPattern.Example;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

    public void print(Collection<Order> orders);

}
