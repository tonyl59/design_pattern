package Exercices.TP_Santa;

import Exercices.TP_Santa.Decorator.ColorDecorator;
import Exercices.TP_Santa.Decorator.PackagingDecorator;
import Exercices.TP_Santa.Factory.BigFactory;
import Exercices.TP_Santa.Factory.FigurineFactory;
import Exercices.TP_Santa.Factory.PlushieFactory;
import Exercices.TP_Santa.Factory.Toy;
import Exercices.TP_Santa.Observer.ElfManager;
import Exercices.TP_Santa.Observer.MyObserver;
import Exercices.TP_Santa.Observer.Observer;

public class Main {
    public static void main(String[] args) {
        BigFactory bigFactory = new BigFactory();
        bigFactory.registerFactory("figurine", new FigurineFactory());
        bigFactory.registerFactory("plushie", new PlushieFactory());

        ElfManager manager = new ElfManager();
        Observer elf1 = new MyObserver("Wiggy");
        Observer elf2 = new MyObserver("Binky");
        Observer elf3 = new MyObserver("Ponky");

        manager.addObserver(elf1);
        manager.addObserver(elf2);
        manager.addObserver(elf3);



        Toy action_man = bigFactory.makeToy("figurine");
        manager.notifyObserver("An action man figure is created");
        Toy action_man_blue = new ColorDecorator(action_man,"blue");

        manager.notifyObserver("The action man figure is now colored in blue");

        manager.removeObserver(elf2);
        manager.notifyObserver("One of your colleague is in sick leave");



        Toy action_man_blue_packaged = new PackagingDecorator(action_man_blue);
        System.out.println(action_man_blue_packaged.check_info());
        System.out.println(action_man_blue_packaged.check_action());
        System.out.println(action_man_blue_packaged.get_price()+"€");

        manager.notifyObserver("The action man figure is now packaged and is ready to be sent");

        System.out.println();

        Toy pikachu =  bigFactory.makeToy("plushie");
        Toy pikachu_packaged = new PackagingDecorator(pikachu);
        System.out.println(pikachu_packaged.check_info());
        System.out.println(pikachu_packaged.check_action());
        System.out.println(pikachu_packaged.get_price()+"€");
        manager.notifyObserver("The pikachu is made and just got packaged, I'll leave the delivery to both of you");



    }
}
