package ObserverDesignPattern.WeatherStationExample.Observable;
import java.util.*;

import ObserverDesignPattern.WeatherStationExample.Observer.ForecastObserver;

public class WindObservableImpl implements ForecastObservable{

    private double data;
    private List<ForecastObserver> observerList;

    public WindObservableImpl(){
        this.data = 0;
        this.observerList = new LinkedList<>(); 

    }

    @Override
    public void addSubscriber(ForecastObserver forecastObserver) {
        observerList.add(forecastObserver);
    }

    @Override
    public void removeSubscriber(ForecastObserver forecastObserver) {
        observerList.remove(forecastObserver);
    }

    @Override
    public void notifySubsriber(String message) {
        for(ForecastObserver observer : observerList){
            observer.update(message);
        }
    }
    @Override
    public double getData() {
        return data;
    }
        
    @Override
    public void setData(double data) {
        this.data = data;

        if(data > 45){
            notifySubsriber("Weather is Windy!");
        }

    }


    
}
