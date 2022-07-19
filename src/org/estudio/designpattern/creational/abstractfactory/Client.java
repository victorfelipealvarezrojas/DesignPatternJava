package org.estudio.designpattern.creational.abstractfactory;

import org.estudio.designpattern.creational.abstractfactory.aws.AwsResourceFactory;
import org.estudio.designpattern.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap); // product instance
        Storage storage = factory.createStorage(storageMib); // product storage
        instance.attachStorage(storage); // create to final product (instance + storage)
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory()); // concrete factory AWS
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("******************************************************");
        Client gcp = new Client(new GoogleResourceFactory()); // concrete factory GOOGLE
        Instance i2 = gcp.createServer(Instance.Capacity.large, 99999);
        i2.start();
        i2.stop();
    }
}
