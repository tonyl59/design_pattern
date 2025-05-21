package Exercices.TP_Santa.Factory;

public class Figurine implements Toy{
    @Override
    public String check_info() {
        return "A plastic figure ressembling a living being.";

    }

    @Override
    public String check_action() {
        return "You can make its legs and arms move, as well as removing its head and putting it back!";
    }

    @Override
    public double get_price() {
        return 10.00;
    }
}
