package Exercices.TP_Santa.Factory;

public class Model_carFactory extends ToyFactory {

    @Override
    public Toy createToy() {
        return new Model_car();
    }
}
