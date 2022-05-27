package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.ejemplo;

import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaProduct;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.factory.PizzaShopCaliforniaFactory;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.factory.PizzaShopNewYorkFactory;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.factory.PizzaShopZoneAbstractFactory;


public class EjemploFActory {

    public static void main(String[] args) {
        PizzaShopZoneAbstractFactory ny = new PizzaShopNewYorkFactory();
        PizzaShopZoneAbstractFactory ca = new PizzaShopCaliforniaFactory();

        PizzaProduct pizzacal = ca.orderPizza("vegetariana");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        PizzaProduct pizzany  = ny.orderPizza("vegetariana");

    }


}
