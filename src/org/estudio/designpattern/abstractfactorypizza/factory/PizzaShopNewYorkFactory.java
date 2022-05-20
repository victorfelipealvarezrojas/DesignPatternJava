package org.estudio.designpattern.abstractfactorypizza.factory;

import org.estudio.designpattern.abstractfactorypizza.product.PizzaProduct;
import org.estudio.designpattern.abstractfactorypizza.product.PizzaNewYorkItaliana;
import org.estudio.designpattern.abstractfactorypizza.product.PizzaNewYorkPepperoni;
import org.estudio.designpattern.abstractfactorypizza.product.PizzaNewYorkVegan;

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
