package pizza.pizzas;

import pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {

        name="ChicagoCheese";

    }

    @Override
    public void prepare() {
        System.out.println("Add extra parmesan cheese");
        //super.prepare();
    }
}
