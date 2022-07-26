package org.estudio.designpattern.creational.FactoryMethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
