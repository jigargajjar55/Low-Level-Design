package TemplateDesignPattern.OrderExample;

public class Client {
    
    public static void main(String[] args) {
        
        OrderPrinter printer = new TextPrinter();

        printer.printOrder();
    }
}
