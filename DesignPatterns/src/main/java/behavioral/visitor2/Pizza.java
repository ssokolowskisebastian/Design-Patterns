package behavioral.visitor2;

public class Pizza implements Visitable{
    double pizzaPrice;

    public Pizza(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }


    public void accept(Visitor v) {
        v.visit(this);

    }
}
