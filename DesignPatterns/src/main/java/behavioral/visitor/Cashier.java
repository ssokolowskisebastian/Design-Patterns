package behavioral.visitor;

public class Cashier implements ShoppingMallVisitor {
    String name;
    int totalPrice=0;

    public Cashier(String name) {
        this.name = name;
    }


    public void visit(Product product) {
        totalPrice=totalPrice+product.getPrice();
    }
}
