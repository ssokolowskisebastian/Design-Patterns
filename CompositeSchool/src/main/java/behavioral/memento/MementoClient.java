package behavioral.memento;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setLedTV(new LedTV(4200,42));

        CareTaker careTaker=new CareTaker();
        careTaker.addMemento(originator.createMemento());

        originator.setLedTV(new LedTV(4300,43));
        careTaker.addMemento(originator.createMemento());

        originator.setLedTV(new LedTV(4500,44));
        System.out.println(originator);
    }
}
