package pizza.pizzas;

import pizza.Pizza;

public class NYCheesePizza extends Pizza {

        public NYCheesePizza(){
            name="NYCheese";
        }

    @Override
    public void prepare() {
            System.out.println("Add emmentaler cheese");
            //super.prepare();
    }
}
