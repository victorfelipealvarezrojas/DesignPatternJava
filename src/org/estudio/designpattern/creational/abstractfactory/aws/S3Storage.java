package org.estudio.designpattern.creational.abstractfactory.aws;

import org.estudio.designpattern.creational.abstractfactory.Storage;

// Represent a concrete product in a family "AWS"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMib){
        // use AWS s3 api
        System.out.println("Allocated" + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
