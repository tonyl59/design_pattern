package Exercices.exercice1;

import org.example.creational.builder.Person;

public class House {
    private int nb_floor;
    private boolean is_pool;
    private String type; // roofing type
    private String color; // roofing color

    private House(House.Builder builder){ // Etant en privé, n'est pas utilisable par les utilisateurs dernières
        nb_floor = builder.nb_floor;
        is_pool = builder.is_pool;
        type = builder.type;
        color = builder.color;
    }

    public static class Builder{ // Je veux pas construire la classe avec "new"... je veux que ce soit un static
        private int nb_floor;
        private boolean is_pool;
        private String type; // roofing type
        private String color; // roofing color

        public House.Builder nb_floor(int nb_floor){
            this.nb_floor = nb_floor;
            return this;
        }

        public House.Builder is_pool(boolean is_pool){
            this.is_pool = is_pool;
            return this;
        }

        public House.Builder type(String type){
            this.type = type;
            return this;
        }

        public House.Builder color(String color){
            this.color = color;
            return this;
        }
        public House build(){
            return new House(this);
    }

        }

    @Override
    public String toString() {
        return "House{" +
                "nb_floor=" + nb_floor +
                ", is_pool=" + is_pool +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
