package TemplateDesignPattern.PaymentExample;

public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate the request for Pay to Merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("1.2% Fees apply");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount from your Account");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount to Merchant's Account");
    }

}
