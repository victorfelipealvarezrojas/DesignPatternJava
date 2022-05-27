package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.factory;

import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaProduct;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaNewYorkItaliana;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaNewYorkPepperoni;
import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaNewYorkVegan;

public class PizzaShopNewYorkFactory extends  PizzaShopZoneAbstractFactory {

    @Override
    PizzaProduct createPizza(String type) {
        PizzaProduct producto = null;

        switch (type) {
            case "vegetariana":
                producto = new PizzaNewYorkVegan();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
            default: break;
        }
        return producto;
    }
}
