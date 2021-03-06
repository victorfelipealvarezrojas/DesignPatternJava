package org.estudio.designpattern.abstractfactorypizza.ejemplo;

import org.estudio.designpattern.abstractfactorypizza.product.PizzaProduct;
import org.estudio.designpattern.abstractfactorypizza.factory.PizzaShopCaliforniaFactory;
import org.estudio.designpattern.abstractfactorypizza.factory.PizzaShopNewYorkFactory;
import org.estudio.designpattern.abstractfactorypizza.factory.PizzaShopZoneAbstractFactory;


public class EjemploFActory {

    public static void main(String[] args) {
        PizzaShopZoneAbstractFactory ny = new PizzaShopNewYorkFactory();
        PizzaShopZoneAbstractFactory ca = new PizzaShopCaliforniaFactory();

        PizzaProduct pizzacal = ca.orderPizza("vegetariana");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        PizzaProduct pizzany  = ny.orderPizza("vegetariana");

    }
}
