package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product;

public class PizzaCaliforniaVegan extends PizzaProduct {

    public PizzaCaliforniaVegan() {
        super();
        name = "Pizza vegetariana california";
        dough = "Masa integral vegana";
        sauce = "Salsa de tomate";
        ingredients.add("Queso vegano");
        ingredients.add("Tomate");
        ingredients.add("Aceitunas");
        ingredients.add("Espinacas");
        ingredients.add("Berenjenas");
    }

    @Override
    public void toCook() {
        System.out.println("Cocinando por 30 minutos a 120g");
    }

    @Override
    public void cut() {
        System.out.println("Cortando pizza en triangulos grandes");
    }
}
