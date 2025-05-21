package Exercices.TP_Santa.Factory;

public class PlushieFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new Plushie();
    }
}
