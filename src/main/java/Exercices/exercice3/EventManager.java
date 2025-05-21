package Exercices.exercice3;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Observer> observers = new ArrayList<>();
    private static int count;

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove((observer));
    }

    public void notifyObserver(String event){
        count++;
        System.out.println("Evenement n°"+count+": "+event);
        for (Observer observer: observers){
            observer.update("a reçu");
        }
    }
}
