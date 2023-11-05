

 package FactoryMethodDesignPattern.LogisticsExample.LogisticFactory;

import FactoryMethodDesignPattern.LogisticsExample.Transport.Transport;
import FactoryMethodDesignPattern.LogisticsExample.Transport.Truck;

public class RoadLogistic implements LogisticFactory{

    @Override
    public Transport createTransport() {
        
        return new Truck();
    }

    

    
}