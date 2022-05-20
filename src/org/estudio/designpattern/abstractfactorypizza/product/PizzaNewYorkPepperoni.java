package org.estudio.designpattern.abstractfactorypizza.product;

public class PizzaNewYorkPepperoni extends PizzaProduct {

    public PizzaNewYorkPepperoni() {
        super();
        name = "Pizza peperonni new york";
        dough = "Masa delgada a la piedra";
        sauce = "Salsa de tomate";
        ingredients.add("Queso mozzarella");
        ingredients.add("Extra peperonni");
        ingredients.add("Aceitunas");
    }

    @Override
    public void toCook() {
        System.out.println("Cocinando ppr 40 minutos a 90g");
    }

    @Override
    public void cut() {
        System.out.println("Cortando pizza en rebanadas triangulos");
    }
}
