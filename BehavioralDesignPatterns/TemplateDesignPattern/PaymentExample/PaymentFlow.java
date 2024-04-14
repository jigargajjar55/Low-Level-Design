package TemplateDesignPattern.PaymentExample;

public abstract class PaymentFlow {
    
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    //This is Template method:- which defines the order of steps to execute the tasks
    public final void sendMoney(){

        //Step1:
        validateRequest();

        //Step2:
        calculateFees();

        //Step3:
        debitAmount();

        //Step4:
        creditAmount();

    }
}
