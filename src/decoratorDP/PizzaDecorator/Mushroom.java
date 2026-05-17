package decoratorDP.PizzaDecorator;

import decoratorDP.Pizza;

public class Mushroom extends PizzaDecorator{
   public Mushroom(Pizza pizza){
    super(pizza);
    }

    public int cost(){
        return pizzaObj.cost()+10;
    }
}
