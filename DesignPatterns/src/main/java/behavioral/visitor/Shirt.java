package behavioral.visitor;

public class Shirt extends Product{
    String brandName;
    Size size;

    public Shirt(String brandName, Size size,int price) {
        this.brandName = brandName;
        this.size = size;
        this.price=price;
    }

    void accept(ShoppingMallVisitor shoppingMallVisitor) {

        shoppingMallVisitor.visit(this);

    }
}
