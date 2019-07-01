package structural.facade;

public class BankLogin {

    long nr=12345678;
    int nrPin=1234;


    public boolean indetyfikacja(long nrKarty,int pin){
        if(nrKarty==nr && pin==nrPin){
            return true;
        }else{
            return false;
        }
    }
    public boolean identyfikacjaOnline(long id,int haslo){
        if(id==12345678 && haslo==123456){
            return true;
        }else{
            return false;
        }
    }
}
