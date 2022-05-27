package org.estudio.designpattern.creational.abstractfactory.abstractfactorycloud.gcp;

import org.estudio.designpattern.creational.abstractfactory.abstractfactorycloud.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib){
        // use gcp api
        System.out.println("Allocated" + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gppcs1";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
