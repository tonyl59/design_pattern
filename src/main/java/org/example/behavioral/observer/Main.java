package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new MyObserver("observer1"); // voir observer comme utilisateur ou comme enregistrement dans un log
        Observer observer2 = new MyObserver("observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver("un nouvel article vient d'arriver !!!");
        subject.notifyObserver("encore un nouvel article qui arrive !!!"); // Les deux observers obtiennent le message sans que je lance une fois chacun

        subject.removeObserver(observer2);
        subject.notifyObserver("une derniere actu !!!");
    }
}
