package TemplateDesignPattern.PaymentExample;

public class Client {
    

    public static void main(String[] args) {
        
        PaymentFlow paymentToFriend = new PayToFriend();

        paymentToFriend.sendMoney();

        PaymentFlow paymentToMerchant = new PayToMerchant();

        paymentToMerchant.sendMoney();
    }
}
