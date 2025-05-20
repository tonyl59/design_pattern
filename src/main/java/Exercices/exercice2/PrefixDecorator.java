package Exercices.exercice2;

public class PrefixDecorator extends TextDecorator {
    public PrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform() {
        return "prEFix"+super.transform();
    }
}
