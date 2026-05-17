package decoratorDP.PizzaDecorator;
import decoratorDP.Pizza;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizzaObj;

    PizzaDecorator(Pizza pizzaObj){
        this.pizzaObj=pizzaObj;
    }
}
