package behavioral.visitor2;

public class TaxVisitor implements Visitor {

    public void visit(Pasta p) {
        p.setPastaPrice(p.getPastaPrice()*3);
    }


    public void visit(Pizza p) {
        p.setPizzaPrice(p.getPizzaPrice()*1.4);

    }


    public void visit(Burger b) {
       b.setBurgerPrice(b.getBurgerPrice()*2);

    }
}
