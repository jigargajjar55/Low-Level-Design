package ObserverDesignPattern.StoreExample.Observer;

import ObserverDesignPattern.StoreExample.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    public void sendMessage(String userName, String msg){
        System.out.println("Message sent to: " + userName);
        System.out.println(observable.getStockCount() + " " + msg);
    }


    @Override
    public void update() {
        sendMessage(userName, "Product is in Stock Hurry up!");
        
    }


    
    
}
