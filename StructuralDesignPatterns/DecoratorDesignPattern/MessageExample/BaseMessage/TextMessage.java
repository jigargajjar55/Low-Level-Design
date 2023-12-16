package StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage;

public class TextMessage implements Message {

    @Override
    public String getContent() {
        
        return "Text Message";
    }

    
    
}
