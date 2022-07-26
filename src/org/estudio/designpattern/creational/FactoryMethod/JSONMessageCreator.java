package org.estudio.designpattern.creational.FactoryMethod;

import org.estudio.designpattern.creational.FactoryMethod.message.JSONMessage;
import org.estudio.designpattern.creational.FactoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
