package org.example.structural.decorator;

//
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+", au Fromage.";
    }

    public double getCost(){
        return super.getCost()+1.5;
    }
}
