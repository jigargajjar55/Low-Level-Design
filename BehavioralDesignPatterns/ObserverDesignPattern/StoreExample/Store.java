package ObserverDesignPattern.StoreExample;

import ObserverDesignPattern.StoreExample.Observable.StockObservable;
import ObserverDesignPattern.StoreExample.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.StoreExample.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.StoreExample.Observer.NotificationAlertObserver;
import ObserverDesignPattern.StoreExample.Observable.IphoneObservableImpl;
import ObserverDesignPattern.StoreExample.Observable.MixerObservableImpl;


public class Store {

    public static void main(String[] args){

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc.gn@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz.gn@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("jfd_userName", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(-10);
        iphoneStockObservable.setStockCount(100);

        StockObservable mixerStockObservable = new MixerObservableImpl();

        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("abc.df@gmail.com", mixerStockObservable);
        NotificationAlertObserver observer5 = new MobileAlertObserverImpl("dsfjh_username", mixerStockObservable);

        mixerStockObservable.add(observer4);
        mixerStockObservable.add(observer5);

        mixerStockObservable.setStockCount(20);
        mixerStockObservable.setStockCount(-20);
        mixerStockObservable.setStockCount(300);

        



    }
    
}
