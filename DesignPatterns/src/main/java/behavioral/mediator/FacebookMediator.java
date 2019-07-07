package behavioral.mediator;

public interface FacebookMediator {

    void sendMessage(User user, String msg);
    void registerUser(User user);
}
