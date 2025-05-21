package Exercices.exercice4;

import java.util.HashMap;
import java.util.Map;

public class BigFactory {
    // Ici le hashmap m'interesse car fonctionne en clé valeur

    private Map<String,AnimalFactory> factoryMap = new HashMap<>();
    public void enregistrerFactory(String typeFactory, AnimalFactory factory){
        factoryMap.put(typeFactory,factory);
    }

    public Animal produireAnimal(String typeAnimal){
        AnimalFactory factory = factoryMap.get(typeAnimal);
        Animal animal = factory.createAnimal();
        return animal;
    }
}
