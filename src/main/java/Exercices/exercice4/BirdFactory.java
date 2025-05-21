package Exercices.exercice4;

import org.example.creational.factoryMethod.VehicleFactory;

public class BirdFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bird();
    }
}
