package ObserverDesignPattern;

import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;
import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.MixerObservableImpl;


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
