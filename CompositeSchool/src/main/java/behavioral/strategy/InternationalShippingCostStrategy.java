package behavioral.strategy;

public class InternationalShippingCostStrategy extends ShippingCost {


    public InternationalShippingCostStrategy(SalesOrder salesOrder) {
        super(salesOrder);
    }

    boolean isHeavy(){
        return salesOrder.totalWeight()>10;
    }

    int shippingCost() {
        if(isHeavy()){
            return 70;
        }else{
            return 50;
        }


    }
}
