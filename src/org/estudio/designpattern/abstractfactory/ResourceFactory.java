package org.estudio.designpattern.abstractfactory;

// Abstract factory with method defined for each object type
// interface factory abstract representation, resources factory
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity  capacity); // product

    Storage createStorage(int capMib);  // product
}
