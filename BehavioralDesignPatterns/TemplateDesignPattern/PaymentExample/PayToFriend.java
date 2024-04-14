package TemplateDesignPattern.PaymentExample;

public class PayToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate request for Pay to Friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Zero Fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount from your Account");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount to Friend's Account");
    }

}
