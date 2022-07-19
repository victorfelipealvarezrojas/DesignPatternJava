package org.estudio.designpattern.creational.abstractfactory.aws;

import org.estudio.designpattern.creational.abstractfactory.*;

// implementation concrete for abstract factory AWS resource
public class AwsResourceFactory  implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity); // product instance
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib); // product instance
    }
}
