package behavioral.visitor;

        import java.util.ArrayList;
        import java.util.LinkedHashMap;
        import java.util.List;

public class ShoppingMallProducts {
    static LinkedHashMap<String, Product> productMap;
    Cashier cashier=new Cashier("jon");
    static {
        productMap = new LinkedHashMap<String, Product>();
        Product product1 = new Shirt("reebok", Size.S, 29);
        Product product2 = new Shirt("nike", Size.M, 49);
        Product product3 = new Shirt("adidas", Size.L, 89);

        productMap.put("shirt1", product1);
        productMap.put("shirt2", product2);
        productMap.put("shirt3", product3);
    }
    int getTotalAmount(List<Product> productList){

        for(Product p:productList){
            p.accept(cashier);
        }
        return cashier.totalPrice;
    }


}
