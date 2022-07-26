package org.estudio.designpattern.creational.FactoryMethod;

import org.estudio.designpattern.creational.FactoryMethod.message.Message;

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
