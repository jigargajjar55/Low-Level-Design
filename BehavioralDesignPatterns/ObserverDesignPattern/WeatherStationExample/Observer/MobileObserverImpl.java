package ObserverDesignPattern.WeatherStationExample.Observer;

import ObserverDesignPattern.WeatherStationExample.Observable.ForecastObservable;

public class MobileObserverImpl implements ForecastObserver {

    String userName;
    ForecastObservable forecastDetail;

    public MobileObserverImpl(ForecastObservable forecastDetail, String userName) {
        this.userName = userName;
        this.forecastDetail = forecastDetail;
    }

    private void sendMessage(double data, String message) {

        System.out.println("Message send to: " + userName);
        System.out.println("Message: " + message);

    }

    @Override
    public void update(String message) {

        sendMessage(forecastDetail.getData(), message);

    }

}
