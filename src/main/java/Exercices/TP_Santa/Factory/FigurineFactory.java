package Exercices.TP_Santa.Factory;

public class FigurineFactory extends ToyFactory{

    @Override
    public Toy createToy() {
        return new Figurine();
    }
}
