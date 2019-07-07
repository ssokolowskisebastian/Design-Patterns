package behavioral.strategy;

public class BookShippingCostStrategy extends ShippingCost {


    public BookShippingCostStrategy(SalesOrder salesOrder) {
        super(salesOrder);
    }

    int shippingCost() {

        if(isEligibleForFreeShipping()) {
            return 0;
        }else{
            return 25;
        }

    }

    boolean isEligibleForFreeShipping(){
        return salesOrder.totalPrice()>200;
    }
}
