package Exercices.exercice4;

public class Bird implements Animal{
    @Override
    public void makeSound() {
        System.out.println("chirp chirp!");

    }

    @Override
    public void movement() {
        System.out.println("The bird flies");

    }

}
