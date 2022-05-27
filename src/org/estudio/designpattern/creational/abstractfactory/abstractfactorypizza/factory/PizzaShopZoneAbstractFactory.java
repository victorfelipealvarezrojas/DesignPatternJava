package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.factory;

import org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product.PizzaProduct;

public abstract class PizzaShopZoneAbstractFactory {

    public PizzaProduct orderPizza(String type) {

        PizzaProduct pizza = createPizza(type);

        System.out.println("Fabricando la pizza " + pizza.getName() + "--------");

        pizza.make();

        pizza.toCook();

        pizza.cut();

        pizza.packagesPizza();

        return pizza;
    }

    abstract PizzaProduct createPizza(String type);
}
