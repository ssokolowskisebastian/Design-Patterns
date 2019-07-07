package behavioral.visitor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ClientVisitor {
    public static void main(String[] args) {

        LinkedHashMap<String ,Product> productMap = ShoppingMallProducts.productMap;

        List<Product> products=new ArrayList<Product>();
        products.add(productMap.get("shirt1"));
        products.add(productMap.get("shirt2"));

        ShoppingMallProducts shoppingMallProducts=new ShoppingMallProducts();
        System.out.println(shoppingMallProducts.getTotalAmount( products));

    }
}
