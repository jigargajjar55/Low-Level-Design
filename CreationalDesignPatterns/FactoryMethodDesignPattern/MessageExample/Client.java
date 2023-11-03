package FactoryMethodDesignPattern.MessageExample;

import FactoryMethodDesignPattern.MessageExample.Factory.JSONMessageCreator;
import FactoryMethodDesignPattern.MessageExample.Factory.MessageCreator;
import FactoryMethodDesignPattern.MessageExample.Factory.TextMessageCreator;
import FactoryMethodDesignPattern.MessageExample.Message.Message;

public class Client {

	public static void main(String[] args) {

		printMessage(new JSONMessageCreator());

		printMessage(new TextMessageCreator());
		
	}
	
	public static void printMessage(MessageCreator creator) {

		Message msg = creator.getMessage();

		System.out.println(msg);
		
	}
}
