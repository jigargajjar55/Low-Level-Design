package StructuralDesignPatterns.DecoratorDesignPattern.MessageExample;

import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage.ImageMessage;
import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage.Message;
import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.BaseMessage.TextMessage;
import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.Decorators.Base64EncodedMessage;
import StructuralDesignPatterns.DecoratorDesignPattern.MessageExample.Decorators.HtmlEncodedMesage;

public class Client {
    
    public static void main(String[] args) {
        
        Message msg1 = new Base64EncodedMessage(new HtmlEncodedMesage(new ImageMessage()));

        System.out.println(msg1.getContent());

        Message msg2 = new Base64EncodedMessage(new TextMessage());

        System.out.println(msg2.getContent());
    }
}
