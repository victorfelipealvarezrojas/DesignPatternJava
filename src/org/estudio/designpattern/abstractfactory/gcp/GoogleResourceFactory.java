package org.estudio.designpattern.abstractfactory.gcp;

import org.estudio.designpattern.abstractfactory.Instance;
import org.estudio.designpattern.abstractfactory.ResourceFactory;
import org.estudio.designpattern.abstractfactory.Storage;

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
