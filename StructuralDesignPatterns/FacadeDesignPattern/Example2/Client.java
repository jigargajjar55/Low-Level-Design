package StructuralDesignPatterns.FacadeDesignPattern.Example2;

public class Client {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.createOrder();
    }
}
