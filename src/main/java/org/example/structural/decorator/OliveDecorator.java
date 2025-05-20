package org.example.structural.decorator;

//Decorateur pour mes pizzas (ajoute des olives)
public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , avec Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
