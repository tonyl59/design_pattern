package org.example.creational;

import org.example.creational.builder.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().firstName("toto").lastName("tata").age(42).build();
        System.out.println(person);

        Person person1 = new Person.Builder().age(54).lastName("tutu").firstName("titi").build();

        System.out.println(person1);

        Person person2 = new Person.Builder().lastName("test").firstName("test").build();
        Person person3 = new Person.Builder().firstName("test").build();

        System.out.println(person2);
        System.out.println(person3); // comme ça j'ai le constructeur dans toutes les versions que je veux

        Person person4 = new Person.Builder().build();
        System.out.println(person4);
    }
}
