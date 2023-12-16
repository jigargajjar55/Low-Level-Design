package StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.Decorators;

import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage.Message;

public class HtmlEncodedMesage implements MessageDecorator {

    Message baseMessage;

    public HtmlEncodedMesage(Message baseMessage){
        this.baseMessage = baseMessage;
    }

    @Override
    public String getContent() {
        return "This Message is HTML encoded: ( " + this.baseMessage.getContent() +" )";
    }
    
}
