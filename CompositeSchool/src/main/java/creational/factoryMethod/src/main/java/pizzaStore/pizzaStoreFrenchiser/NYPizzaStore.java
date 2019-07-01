package pizzaStore.pizzaStoreFrenchiser;

import pizza.Pizza;
import pizza.pizzas.*;
import pizzaStore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        if(type.equals("NYCheese")){
            return new NYCheesePizza();
        } else{
            throw new IllegalArgumentException();
        }


    }
}
