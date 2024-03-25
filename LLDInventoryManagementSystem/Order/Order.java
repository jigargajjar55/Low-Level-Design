package LLDInventoryManagementSystem.Order;

import java.util.Map;

import LLDInventoryManagementSystem.Address.Address;
import LLDInventoryManagementSystem.Invoice.Invoice;
import LLDInventoryManagementSystem.Payment.Payment;
import LLDInventoryManagementSystem.Payment.PaymentMode;
import LLDInventoryManagementSystem.Payment.UPIPaymentMode;
import LLDInventoryManagementSystem.User.User;
import LLDInventoryManagementSystem.Warehouse.Warehouse;

public class Order {

    User user;
    Address deliveryAddress;
    Map<Integer, Integer> productCategoryAndCountMap;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user, Warehouse warehouse){
      this.user = user;
      this.productCategoryAndCountMap = user.getUserCart().getCartItems();
      this.warehouse = warehouse;
      this.deliveryAddress = user.address;
      invoice = new Invoice();
      invoice.generateInvoice(this);
    }

    public void checkout(){

        //1. update inventory
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        //2. make Payment
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        //3. make cart empty
        if(isPaymentSuccess) {
            user.getUserCart().emptyCart();
        }
        else{
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }

    }

    public boolean makePayment(PaymentMode paymentMode){
        payment = new Payment(paymentMode);
       return payment.makePayment();
    }

    public void generateOrderInvoice(){
        invoice.generateInvoice(this);
    }
}
