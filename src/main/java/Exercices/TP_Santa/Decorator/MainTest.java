package Exercices.TP_Santa.Decorator;

import Exercices.TP_Santa.Factory.*;
import org.example.structural.decorator.CheeseDecorator;
import org.example.structural.decorator.Pizza;

public class MainTest {
    public static void main(String[] args) {
        BigFactory bigFactory = new BigFactory();
        bigFactory.registerFactory("figurine", new FigurineFactory());


        Toy action_man = bigFactory.makeToy("figurine");
        Toy action_man_blue = new ColorDecorator(action_man,"blue");
        System.out.println(action_man_blue.check_info());
        System.out.println(action_man_blue.check_action());
        System.out.println(action_man_blue.get_price()+"€");

        Toy action_man_blue_packaged = new PackagingDecorator(action_man_blue);
        System.out.println(action_man_blue_packaged.check_info());
        System.out.println(action_man_blue_packaged.check_action());
        System.out.println(action_man_blue_packaged.get_price()+"€");


    }
}
