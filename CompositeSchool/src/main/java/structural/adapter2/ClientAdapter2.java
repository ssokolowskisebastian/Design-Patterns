package structural.adapter2;

public class ClientAdapter2 {
    public static void main(String[] args){
        IEDriver ieDriver=new IEDriver();
        WebDriverAdapter webDriverAdapter=new WebDriverAdapter(ieDriver);
        System.out.println(webDriverAdapter.getElement());
    }
}
