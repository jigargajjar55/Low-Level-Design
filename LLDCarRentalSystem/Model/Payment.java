package LLDCarRentalSystem.Model;

import java.util.Date;

public class Payment {
    int paymentID;
    Bill bill;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;

    public Payment(){};
  

    public Payment(int paymentID, Bill bill, Date dateOfPayment, boolean isRefundable, PaymentMode paymentMode) {
        this.paymentID = paymentID;
        this.bill = bill;
        this.dateOfPayment = dateOfPayment;
        this.isRefundable = isRefundable;
        this.paymentMode = paymentMode;
    }

    public void payBill(Bill bill) {
        // do payment processing and update the bill status;
    }

}
