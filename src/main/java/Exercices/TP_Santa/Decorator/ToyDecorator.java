package Exercices.TP_Santa.Decorator;

import Exercices.TP_Santa.Factory.Toy;

public abstract class ToyDecorator implements Toy {
    protected Toy toy;

    public ToyDecorator(Toy toy){
        this.toy = toy;
    }


    @Override
    public String check_action() {
        return toy.check_action();
    }

    @Override
    public String check_info() {
        return toy.check_info();
    }

    @Override
    public double get_price() {
        return toy.get_price();
    }
}

//package org.example.structural.decorator;
//
//public abstract class PizzaDecorator implements Pizza{
//    protected Pizza pizza;
//
//    public PizzaDecorator(Pizza pizza) {
//        this.pizza = pizza;
//    }
//
//
//    @Override
//    public String getDescription() {
//        return pizza.getDescription();
//    }
//
//    @Override
//    public double getCost() {
//        return pizza.getCost();
//    }
//}