package org.estudio.designpattern.creational.abstractfactorypizza.product;

public class PizzaNewYorkVegan extends PizzaProduct {

    public PizzaNewYorkVegan() {
        super();
        name = "Pizza vegetariana new york";
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
        System.out.println("Cocinando ppr 25 minutos a 250g");
    }

    @Override
    public void cut() {
        System.out.println("Cortando pizza en rebanadas cuadradas");
    }
}
