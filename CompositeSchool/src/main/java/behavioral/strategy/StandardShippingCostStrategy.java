package behavioral.strategy;

public class StandardShippingCostStrategy extends ShippingCost {


    public StandardShippingCostStrategy(SalesOrder salesOrder) {
        super(salesOrder);
    }

    int shippingCost() {
        return 15;
    }
}
