package Exercices.TP_Santa.Observer;

public class Maintest {
    public static void main(String[] args) {
        ElfManager manager = new ElfManager();
        Observer elf1 = new MyObserver("Wiggy");
        Observer elf2 = new MyObserver("Binky");
        Observer elf3 = new MyObserver("Ponky");

        manager.addObserver(elf1);
        manager.addObserver(elf2);
        manager.addObserver(elf3);

        manager.notifyObserver("Le jouet est prêt!");
    }
}

/*        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver("un nouvel article vient d'arriver !!!");
        subject.notifyObserver("encore un nouvel article qui arrive !!!"); // Les deux observers obtiennent le message sans que je lance une fois chacun

        subject.removeObserver(observer2);
        subject.notifyObserver("une derniere actu !!!");*/
