package TemplateDesignPattern.OrderExample;

public abstract class OrderPrinter {
    
    public abstract void start();
    public abstract void formatOrderNo();
    public abstract void formatOrderBody();
    public abstract void end();

    //Template method: Specific steps need to execute
    public final void printOrder(){

        //Step 1
        start();

        //Step 2
        formatOrderBody();

        //Step 3        
        formatOrderNo();

        //Step 4
        end();

    }
}
