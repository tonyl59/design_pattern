package Exercices.exercice2;

public class LowercaseDecorator extends TextDecorator {
    public LowercaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform() {
        return super.transform().toLowerCase();
    }
}

