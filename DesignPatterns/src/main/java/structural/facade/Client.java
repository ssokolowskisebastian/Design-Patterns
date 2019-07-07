package structural.facade;

public class Client {

    public static void main(String[] args){

        BankomatFasada bankomatFasada=new BankomatFasada(new BankLogin(),new BankSystem());
        System.out.println(bankomatFasada.indetyfikacja(12345678,1234));
        System.out.println(bankomatFasada.sparwdzStanKonta(1234567));
        System.out.println(bankomatFasada.wyplacGotowke(1234,123));




    }
}
