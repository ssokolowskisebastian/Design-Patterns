package pizzaStore;

import pizza.Pizza;
import pizzaStore.pizzaStoreFrenchiser.NYPizzaStore;


public abstract class PizzaStore {


    public Pizza orderPizza(String type){

        Pizza pizza;
        pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
    public abstract Pizza createPizza(String type);

    public static void main(String[] args) {

        PizzaStore p=new NYPizzaStore();
        p.orderPizza("NYCheese");

    }
}
