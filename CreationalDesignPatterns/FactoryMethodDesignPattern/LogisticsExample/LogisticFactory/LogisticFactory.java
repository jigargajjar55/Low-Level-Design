package FactoryMethodDesignPattern.LogisticsExample.LogisticFactory;

import FactoryMethodDesignPattern.LogisticsExample.Transport.Transport;

public interface LogisticFactory {

    public Transport createTransport();

    
} 