package behavioral.visitor2;

public class ClientVisitor2 {
    public static void main(String[] args) {
        Pasta pasta=new Pasta(10);
        Pizza pizza=new Pizza(20);
        Burger burger=new Burger(15);

        Visitor taxVisitor= new TaxVisitor();
        System.out.println(pasta.getPastaPrice());

        taxVisitor.visit(pasta);
        System.out.println(pasta.getPastaPrice());
        pasta.accept(taxVisitor);
        System.out.println(pasta.getPastaPrice());


        System.out.println("Burger netto price: "+burger.getBurgerPrice());

        System.out.println("Burger price: "+burger.getBurgerPrice());
        burger.accept(taxVisitor);
        burger.accept(taxVisitor);

        System.out.println("Burger price: "+burger.getBurgerPrice());



    }
}
