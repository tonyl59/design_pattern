package Exercices.TP_Santa.Factory;

public class Maintest {
    public static void main(String[] args) {
        BigFactory bigFactory = new BigFactory();
        bigFactory.registerFactory("figurine", new FigurineFactory());
        bigFactory.registerFactory("model_car", new Model_carFactory());
        bigFactory.registerFactory("plushie", new PlushieFactory());

        Toy action_man = bigFactory.makeToy("figurine");
        System.out.println(action_man.check_info());
        System.out.println(action_man.check_action());
        System.out.println(action_man.get_price()+"€");

        System.out.println();

        Toy car = bigFactory.makeToy("model_car");
        System.out.println(car.check_info());
        System.out.println(car.check_action());
        System.out.println(car.get_price()+"€");

        System.out.println();

        Toy pikachu =  bigFactory.makeToy("plushie");
        System.out.println(pikachu.check_info());
        System.out.println(pikachu.check_action());
        System.out.println(pikachu.get_price()+"€");



    }
}
