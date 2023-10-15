package ObserverDesignPattern.Observable;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.List;
import java.util.ArrayList;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> observerList;
    public int stockCount;

    public IphoneObservableImpl(){
        observerList = new ArrayList<>();
        stockCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
        
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
        
    }
    

    @Override
    public void notifySubscribers() {
        
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
        
    } 

    @Override
    public void setStockCount(int newStockCount) {
        
        stockCount += newStockCount;
        
        if(stockCount == 0){
            notifySubscribers();
        }

        
        
        
    }

    @Override
    public int getStockCount() {
        
        return stockCount;
    }

    




    
}
