package org.estudio.designpattern.creational.FactoryMethod;

import org.estudio.designpattern.creational.FactoryMethod.message.Message;
import org.estudio.designpattern.creational.FactoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
