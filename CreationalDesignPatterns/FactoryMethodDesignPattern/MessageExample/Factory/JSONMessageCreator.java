package FactoryMethodDesignPattern.MessageExample.Factory;

import FactoryMethodDesignPattern.MessageExample.Message.JSONMessage;
import FactoryMethodDesignPattern.MessageExample.Message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
       
        return new JSONMessage();
    }
	
}
