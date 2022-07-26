package org.estudio.designpattern.creational.FactoryMethod;

import org.estudio.designpattern.creational.FactoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();

	
}
