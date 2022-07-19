package org.estudio.designpattern.creational.abstractfactory;

// Represent an abstract product instance
public interface Instance {
    enum Capacity {
        micro,
        small,
        large
    }
    void start();

    void attachStorage(Storage storage);

    void stop();
}
