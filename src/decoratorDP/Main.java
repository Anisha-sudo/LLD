package decoratorDP;

import decoratorDP.PizzaDecorator.CheeseBurst;
import decoratorDP.PizzaDecorator.Mushroom;

public class Main {
    public static void main(String[] args){
        Pizza regularCrust= new RegularCrust();
        Pizza ThinCrust=new ThinCrustPizza();

        Pizza pizza= new CheeseBurst(new Mushroom(ThinCrust));
        int cost=pizza.cost();
        System.out.println("Cost is "+cost);
    }
}
