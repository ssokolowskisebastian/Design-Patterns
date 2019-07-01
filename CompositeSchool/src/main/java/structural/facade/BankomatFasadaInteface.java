package structural.facade;

public interface BankomatFasadaInteface {

    public boolean indetyfikacja(long nrKarty, int pin);
    public String wyplacGotowke(long nrKarty,int kwota);
    public int sparwdzStanKonta(long nrKarty);

}
