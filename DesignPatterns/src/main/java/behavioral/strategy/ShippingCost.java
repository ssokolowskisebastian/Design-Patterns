package behavioral.strategy;

public abstract class ShippingCost {
    SalesOrder salesOrder;

    public ShippingCost(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    abstract int shippingCost();

}
