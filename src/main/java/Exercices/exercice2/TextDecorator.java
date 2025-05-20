package Exercices.exercice2;

import org.example.structural.decorator.Pizza;

public abstract class TextDecorator implements Text{
    protected Text text;

    public TextDecorator(Text text){
        this.text = text;
    }

    @Override
    public String transform() {
        return text.transform();
    }
}
