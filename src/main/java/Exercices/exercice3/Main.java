package Exercices.exercice3;

public class Main {
    public static void main(String[] args) {
        EventManager event = new EventManager();
        Observer observer1 = new MyObserver("Paul"); // voir observer comme utilisateur ou comme enregistrement dans un log
        Observer observer2 = new MyObserver("Jacques");
        Observer observer3 = new MyObserver("Géraldine"); // voir observer comme utilisateur ou comme enregistrement dans un log

        event.addObserver(observer1);
        event.addObserver(observer2);
        event.addObserver(observer3);

        event.notifyObserver("Pêche aux moules");
        event.notifyObserver("Chasse à l'escargot"); // Les deux observers obtiennent le message sans que je lance une fois chacun

        event.removeObserver(observer2);
        event.notifyObserver("Course à l'ananas");
    }
}
