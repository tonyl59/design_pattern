package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // Creation d'une Pizza basique
        Pizza basePizza = new PlainPizza();
        System.out.println(basePizza.getDescription()+" "+basePizza.getCost());

        // Ajout de fromage pour créer une nouvelle pizza au fromage
        Pizza cheesePizza = new CheeseDecorator(basePizza);
        System.out.println(cheesePizza.getDescription()+" "+cheesePizza.getCost());

        // Ajout d'olive sur ma pizza au fromage
        Pizza olivePizza = new OliveDecorator(cheesePizza);
        System.out.println(olivePizza.getDescription()+" "+olivePizza.getCost());
    }
}
