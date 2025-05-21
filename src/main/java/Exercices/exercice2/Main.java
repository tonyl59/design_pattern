package Exercices.exercice2;


public class Main {
    public static void main(String[] args) {
        Text baseText = new PlainText();
        //System.out.println(baseText.transform("tEXte"));

        // Ajout de fromage pour créer une nouvelle pizza au fromage
        Text Textlower = new LowercaseDecorator(baseText);
        System.out.println(Textlower.transform("TeSt teXte"));

        // Ajout d'olive sur ma pizza au fromage
        Text Textprefix = new PrefixDecorator(Textlower, "preEfiX ");
        System.out.println(Textprefix.transform("TeSt teXte"));
        System.out.println(Textprefix.transform("AaaaAAA"));
        // Ce qui est interessant dans ces deux derniers sout c'est qu'on a toujours la transformation en minuscule
        // Il faut aussi savoir que le nouveau input va ecraser le premier transform
        // Si je met la transfo prefixe avant le min, j'aurais le prefix entièrement en minuscule
    }
}
