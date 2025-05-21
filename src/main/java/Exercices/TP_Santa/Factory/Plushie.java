package Exercices.TP_Santa.Factory;

public class Plushie implements Toy{
    @Override
    public String check_info() {
        return "It's made of soft materials & is so fluffy !";

    }


    @Override
    public String check_action() {
        return "You can cuddle and sleep on it...";

    }

    @Override
    public double get_price() {
        return 20.00;
    }
}
