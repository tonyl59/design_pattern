package Exercices.TP_Santa.Factory;

import java.util.HashMap;
import java.util.Map;

public class BigFactory {

    private Map<String, ToyFactory> factoryMap = new HashMap<>();
    public void registerFactory(String typeFactory, ToyFactory factory){
        factoryMap.put(typeFactory,factory);
    }

    public Toy makeToy(String typeToy){
        ToyFactory factory = factoryMap.get(typeToy);
        Toy toy = factory.createToy();
        return toy;
    }
}
