package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class FacebookMediatorImplementation implements FacebookMediator {

    List<User> users=new ArrayList<User>();


    public void sendMessage(User user, String msg) {

        for (User u:users){
            if(u!=user){
                u.receive(msg);
            }
        }

    }

    public void registerUser(User user) {
        users.add(user);

    }
}
