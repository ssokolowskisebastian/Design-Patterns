package behavioral.mediator;

public abstract class User {
    String name;
    FacebookMediator facebookMediator;

    public User(String name, FacebookMediator facebookMediator) {
        this.name = name;
        this.facebookMediator = facebookMediator;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
