package structural.facade;

public class BankomatFasada implements BankomatFasadaInteface {

    public BankLogin bankLogin;
    private BankSystem bankSystem;

    public BankomatFasada(BankLogin bankLogin, BankSystem bankSystem) {
        this.bankLogin = bankLogin;
        this.bankSystem = bankSystem;
    }

    public boolean indetyfikacja(long nrKarty, int pin) {

        return bankLogin.indetyfikacja(nrKarty,pin);

    }

    public String wyplacGotowke(long nrKarty, int kwota) {
        return bankSystem.wyplacGowtowke(nrKarty,kwota);
    }

    public int sparwdzStanKonta(long nrKarty) {
        return bankSystem.sprawdzStanKonta(nrKarty);
    }
}
