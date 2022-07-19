package org.estudio.designpattern.creational.abstractfactory.gcp;

import org.estudio.designpattern.creational.abstractfactory.Instance;
import org.estudio.designpattern.creational.abstractfactory.ResourceFactory;
import org.estudio.designpattern.creational.abstractfactory.Storage;

// implementation concrete for abstract factory Google resource
public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity); // product instance
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib); // product instance storage
    }
}
