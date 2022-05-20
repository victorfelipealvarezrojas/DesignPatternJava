package org.estudio.designpattern.abstractfactorypizza.factory;

import org.estudio.designpattern.abstractfactorypizza.product.PizzaProduct;
import org.estudio.designpattern.abstractfactorypizza.product.*;

public class PizzaShopCaliforniaFactory extends PizzaShopZoneAbstractFactory {
    @Override
    PizzaProduct createPizza(String type) {
        PizzaProduct producto = null;

        switch (type) {
            case "vegetariana":
                producto = new PizzaCaliforniaVegan();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
            default: break;
        }
        return producto;
    }
}
