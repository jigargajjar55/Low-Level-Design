package ObserverDesignPattern.WeatherStationExample.Observer;

import ObserverDesignPattern.WeatherStationExample.Observable.ForecastObservable;

public class TabletObserverImpl implements ForecastObserver {

    String emailId;
    ForecastObservable forecastDetail;

    public TabletObserverImpl(ForecastObservable forecastDetail, String emailId) {
        this.emailId = emailId;
        this.forecastDetail = forecastDetail;
    }

    private void sendMessage(double data, String message) {

        System.out.println("Email is send to: " + emailId);
        System.out.println("Message: " + message);

    }

    @Override
    public void update(String message) {

        sendMessage(forecastDetail.getData(), message);

    }

}
