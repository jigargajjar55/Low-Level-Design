package ObserverDesignPattern.WeatherStationExample.Observable;

import ObserverDesignPattern.WeatherStationExample.Observer.ForecastObserver;

public interface ForecastObservable {

    public void addSubscriber(ForecastObserver forecastObserver);

    public void removeSubscriber(ForecastObserver forecastObserver);

    public void notifySubsriber(String message);

    public double getData();

    public void setData(double data);

    
}
