package pizzaStore.pizzaStoreFrenchiser;

import pizza.Pizza;
import pizza.pizzas.*;
import pizzaStore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("ChicagoCheese")){
            return new ChicagoCheesePizza();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
