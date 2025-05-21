package Exercices.exercice3;


public class MyObserver implements Observer{
    private String name;
    public MyObserver(String name){
        this.name = name;
    }


    @Override
    public void update(String reaction) {
        System.out.println(name + " a " + reaction);

    }
}
