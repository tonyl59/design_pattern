package Exercices.exercice1;

import org.example.creational.builder.Person;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder().nb_floor(3).is_pool(true).type("type1").color("red").build();
        System.out.println(house1);

        House house2 = new House.Builder().nb_floor(10).color("blue").build();
        System.out.println(house2);
    }
}


