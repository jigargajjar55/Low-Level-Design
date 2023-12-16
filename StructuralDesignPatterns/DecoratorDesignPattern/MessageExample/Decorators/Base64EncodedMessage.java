package StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage.Message;

public class Base64EncodedMessage implements MessageDecorator {

    Message baseMessage;

    public Base64EncodedMessage(Message baseMessage){
        this.baseMessage = baseMessage;
    }

    @Override
    public String getContent() {

        return "This Message is encoded with Base 64: ( " + this.baseMessage.getContent() + " )";
       
    }
    
}
