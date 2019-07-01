package behavioral.memento;

public class Originator {

    LedTV ledTV;

    public LedTV getLedTV() {
        return ledTV;
    }

    public void setLedTV(LedTV ledTV) {
        this.ledTV = ledTV;
    }

    Memento createMemento(){
        return new Memento(ledTV);
    }



}
