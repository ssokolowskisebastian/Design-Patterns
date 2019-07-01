package behavioral.strategy;



public class SalesOrder {

    //SalesOrder salesOrder;
    int price=100;
    int weight=1;

    public int totalPrice() {
        return price;
    }
    public int getTotalPrice(){
        return price + createShippingCostStrategy().shippingCost();
    }

    public int totalWeight() {
        return weight;
    }

    boolean isInternational(){
        return false;
    }
    boolean hasOnlyBooks(){
        return true;
    }


    ShippingCost createShippingCostStrategy(){
        if(isInternational()){
            return new InternationalShippingCostStrategy(this);
        }if (hasOnlyBooks()){
            return new BookShippingCostStrategy(this);
        }
        return new StandardShippingCostStrategy(this);
    }
}
