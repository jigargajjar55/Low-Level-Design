package ObserverDesignPattern.WeatherStationExample;

import ObserverDesignPattern.WeatherStationExample.Observable.ForecastObservable;
import ObserverDesignPattern.WeatherStationExample.Observable.TempObservableImpl;
import ObserverDesignPattern.WeatherStationExample.Observable.WindObservableImpl;
import ObserverDesignPattern.WeatherStationExample.Observer.ForecastObserver;
import ObserverDesignPattern.WeatherStationExample.Observer.MobileObserverImpl;
import ObserverDesignPattern.WeatherStationExample.Observer.TabletObserverImpl;

public class Client {

    public static void main(String[] args) {

        ForecastObservable tempObservable = new TempObservableImpl();

        ForecastObserver observer1 = new MobileObserverImpl(tempObservable, "jigar@domain");
        ForecastObserver observer2 = new TabletObserverImpl(tempObservable, "Jigar@gmail.com");

        tempObservable.addSubscriber(observer1);
        tempObservable.addSubscriber(observer2);

        ForecastObservable windObservable = new WindObservableImpl();

        ForecastObserver observer3 = new MobileObserverImpl(windObservable, "jigar@domain");
        ForecastObserver observer4 = new TabletObserverImpl(windObservable, "Jigar@gmail.com");

        windObservable.addSubscriber(observer3);
        windObservable.addSubscriber(observer4);

        tempObservable.setData(12);

        windObservable.setData(50);


    }

}
