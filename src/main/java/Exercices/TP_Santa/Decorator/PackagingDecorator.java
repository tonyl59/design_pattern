package Exercices.TP_Santa.Decorator;

import Exercices.TP_Santa.Factory.Toy;

public class PackagingDecorator extends ToyDecorator {
    public PackagingDecorator(Toy toy) {
        super(toy);
    }

    @Override
    public String check_action() {
        return super.check_action()+ " It's packaged with gift wrapping though, so you can only unwrap it first!.";
    }

    @Override
    public String check_info() {
        return super.check_info()+" Its covered with gift wrapping so you can't see it.";
    }

    @Override
    public double get_price() {
        return super.get_price()+2;
    }
}


//    //public class CheeseDecorator extends PizzaDecorator{
//    //    public CheeseDecorator(Pizza pizza){
//    //        super(pizza);
//    //    }
//    //
//    //    @Override
//    //    public String getDescription(){
//    //        return super.getDescription()+", au Fromage.";
//    //    }
//    //
//    //    public double getCost(){
//    //        return super.getCost()+1.5;
//    //    }
//    //}
//}