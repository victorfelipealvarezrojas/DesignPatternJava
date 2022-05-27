package org.estudio.designpattern.creational.abstractfactory.abstractfactorypizza.product;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProduct {
    protected String name;

    protected String dough;

    protected  String sauce;

    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void make(){
        System.out.println("Preparando              ::" + name);
        System.out.println("Seleccionando masa      ::" + dough);
        System.out.println("Agregando salsa         ::" + sauce);
        System.out.println("Agregando ingredientes  ::");
        ingredients.forEach(System.out::print);
    }

    public abstract void toCook();

    public abstract void cut();

    public void packagesPizza(){
        System.out.println("Poniendo pizza en empaque...");
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
