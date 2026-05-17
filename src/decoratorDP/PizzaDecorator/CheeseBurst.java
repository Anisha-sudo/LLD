package decoratorDP.PizzaDecorator;

import decoratorDP.Pizza;

public  class CheeseBurst extends PizzaDecorator{

    public CheeseBurst(Pizza pizza){
        super(pizza);
    }

    public int cost(){
       return pizzaObj.cost()+20;
    }
}
