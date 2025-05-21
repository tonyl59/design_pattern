package Exercices.TP_Santa.Decorator;

import Exercices.TP_Santa.Factory.Toy;

public class ColorDecorator extends ToyDecorator{
    private String color;

    public ColorDecorator(Toy toy, String color) {
        super(toy);
        this.color = color;

    }

    /*@Override
    public String check_action() {
        return super.check_action();
    } */

    @Override
    public String check_info() {
        return super.check_info()+" Now it's color is "+color+".";
    }

    @Override
    public double get_price() {
        return super.get_price()+5;
    };
}
