package behavioral.visitor2;

public class Burger implements Visitable{

    double burgerPrice;

    public Burger(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }


    public void accept(Visitor v) {
        v.visit(this);
    }
}
