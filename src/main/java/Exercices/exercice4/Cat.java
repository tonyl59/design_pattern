package Exercices.exercice4;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("meow");

    }

    @Override
    public void movement() {
        System.out.println("The cat walks with 4 legs");

    }
}
