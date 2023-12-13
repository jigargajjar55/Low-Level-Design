package ObserverDesignPattern.StoreExample.Observer;

import ObserverDesignPattern.StoreExample.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailID;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailID, StockObservable observable){
        this.emailID = emailID;
        this.observable = observable;
    }

    public void sendEmail(String emailID, String msg){
        System.out.println("Mail sent to: " + emailID);
        System.out.println(observable.getStockCount() + " " + msg);
    }

    @Override
    public void update() {
        sendEmail(emailID, "Product is in Stock Hurry up!");
        
    }
    
}
