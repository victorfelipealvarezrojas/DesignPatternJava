package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product;

public class PizzaNewYorkItaliana extends PizzaProduct {

    public PizzaNewYorkItaliana() {
        super();
        name = "Pizza italiana new york";
        dough = "Masa gruesa";
        sauce = "Salsa de tomate italiando con carne";
        ingredients.add("Queso mozzarella");
        ingredients.add("Jamon");
        ingredients.add("Aceitunas");
        ingredients.add("Choricillo");
    }

    @Override
    public void toCook() {
        System.out.println("Cocinando por 30 minutos a 120g");
    }

    @Override
    public void cut() {
        System.out.println("Cortando pizza en rebanadas triangulos grandes");
    }
}
