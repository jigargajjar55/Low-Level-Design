package StructuralDesignPatterns.FacadeDesignPattern.Example2;

public class OrderFacade {

    ProductDAO productDAO;
    Payment payment;
    Invoice invoice;
    SendNotification sendNotification;

    public OrderFacade(){
        productDAO = new ProductDAO();
        payment = new Payment();
        invoice = new Invoice();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        Product product = productDAO.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice(product);
        sendNotification.sendNotification();
        //Order creation is successful
    }

    

}
