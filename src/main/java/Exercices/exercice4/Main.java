package Exercices.exercice4;

public class Main {
    public static void main(String[] args) {
        /*
        AnimalFactory catFactory = new CatFactory();
        Animal cat1 = catFactory.createAnimal();
        cat1.makeSound();
        cat1.movement();

        AnimalFactory birdFactory = new BirdFactory();
        Animal bird1 = birdFactory.createAnimal();
        bird1.makeSound();
        bird1.movement();
        */

        // Code au-dessus pareil qu'en dessous au final, juste qu'on a juste big factory pour creer les animaux plutot que tjr creer une factory par type d'animal
        BigFactory bigFactory = new BigFactory();
        bigFactory.enregistrerFactory("bird", new BirdFactory());
        bigFactory.enregistrerFactory("chat", new CatFactory());

        Animal cat = bigFactory.produireAnimal("chat");
        cat.makeSound();
        cat.movement();
        Animal bird = bigFactory.produireAnimal("bird");
        bird.makeSound();
        bird.movement();
    }
}
