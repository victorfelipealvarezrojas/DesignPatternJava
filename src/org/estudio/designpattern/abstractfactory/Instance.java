package org.estudio.designpattern.abstractfactory;

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
