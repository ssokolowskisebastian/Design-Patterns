package behavioral.strategy;

public class BookShippingCostStrategy extends ShippingCost {


    public BookShippingCostStrategy(SalesOrder salesOrder) {
        super(salesOrder);
    }

    int shippingCost() {

        if(isEligibleForFreeShipping()) {
            return 3;
        }else{
            return 5;
        }

    }

    boolean isEligibleForFreeShipping(){
        return salesOrder.totalPrice()>200;
    }
}
