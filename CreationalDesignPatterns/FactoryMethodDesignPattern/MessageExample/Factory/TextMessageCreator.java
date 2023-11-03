package FactoryMethodDesignPattern.MessageExample.Factory;

import FactoryMethodDesignPattern.MessageExample.Message.Message;
import FactoryMethodDesignPattern.MessageExample.Message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        
        return new TextMessage();
    }



}
