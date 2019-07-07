package structural.facade;

public class BankSystem {

    int stanKonta=10;
    long nr=12345678;


    public int sprawdzStanKonta(long nrKarty){
        if(nrKarty==nr){
        return stanKonta;
        }else{
            return 0;
        }
    }
    public String wyplacGowtowke(long nrKarty,int kwota){

        if(nrKarty==nr) {
            return "wyplacono: " + kwota;
        }else{
           return "Nie znam karty";
        }

    }

    public String wykonajPrzelew(long nrKonta, int kwota){
        return "przelano"+ kwota + "na konto"+ nrKonta;
    }


}
