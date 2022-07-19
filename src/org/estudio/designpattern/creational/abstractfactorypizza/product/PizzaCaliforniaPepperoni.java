package org.estudio.designpattern.creational.abstractfactorypizza.product;

public class PizzaCaliforniaPepperoni extends PizzaProduct {

    public PizzaCaliforniaPepperoni() {
        super();
        name = "Pizza peperonni california";
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
