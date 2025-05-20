package Exercices.exercice2;


public class Main {
    public static void main(String[] args) {
        Text baseText = new PlainText();
        System.out.println(baseText.transform());

        // Ajout de fromage pour créer une nouvelle pizza au fromage
        Text Textlower = new LowercaseDecorator(baseText);
        System.out.println(Textlower.transform());

        // Ajout d'olive sur ma pizza au fromage
        Text Textprefix = new PrefixDecorator(Textlower);
        System.out.println(Textprefix.transform());
    }
}
