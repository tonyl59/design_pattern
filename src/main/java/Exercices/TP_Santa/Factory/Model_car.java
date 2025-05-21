package Exercices.TP_Santa.Factory;

public class Model_car implements Toy{
    @Override
    public String check_info() {
        return "This is a miniature car made of metal";

    }

    @Override
    public String check_action() {
        return "It can be driven with your fingers !";

    }

    @Override
    public double get_price() {
        return 5.00;
    }
}
