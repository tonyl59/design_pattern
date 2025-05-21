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

        event.createEvent("Pêche aux moules");
        observer1.update("a partagé les informations de l'évènement de pêche");
        observer2.update("a mis l'évènement dans le calendrier");
        observer3.update("a aimé la notification d'évènement");

        event.createEvent("Chasse à l'escargot"); // Les deux observers obtiennent le message sans que je lance une fois chacun
        observer1.update("a partagé les informations de l'évènement de chasse");
        observer2.update("se désiste du fil de notifications");
        event.removeObserver(observer2);

        event.createEvent("Course à l'ananas");
        observer1.update("a partagé les informations de l'évènement de course");
        observer3.update("a aimé la notification d'évènement de course");
        observer2.update("test");

        // Ici je dis à mon observateur de faire tel truc alors que c'est lui même qui doit faire l'action


    }
}
