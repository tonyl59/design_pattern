package Exercices.exercice4;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat1 = catFactory.createAnimal();
        cat1.makeSound();
        cat1.movement();

        AnimalFactory birdFactory = new BirdFactory();
        Animal bird1 = birdFactory.createAnimal();
        bird1.makeSound();
        bird1.movement();
    }
}
