package FactoryMethodDesignPattern.LogisticsExample.LogisticFactory;

import FactoryMethodDesignPattern.LogisticsExample.Transport.Ship;
import FactoryMethodDesignPattern.LogisticsExample.Transport.Transport;

public class SeaLogistic implements LogisticFactory {

    @Override
    public Transport createTransport() {
        
        return new Ship();
    }

    
    
}
