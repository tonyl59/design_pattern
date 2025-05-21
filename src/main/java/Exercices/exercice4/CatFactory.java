package Exercices.exercice4;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
