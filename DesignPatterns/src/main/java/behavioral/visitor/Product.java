package behavioral.visitor;

public abstract class Product {
    int price;
    abstract void accept(ShoppingMallVisitor shoppingMallVisitor);

    public int getPrice() {
        return price;
    }
}
