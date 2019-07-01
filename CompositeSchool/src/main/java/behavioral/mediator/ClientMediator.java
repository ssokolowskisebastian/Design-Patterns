package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ClientMediator {
    public static void main(String[] args) {

        FacebookMediator facebookMediator=new FacebookMediatorImplementation();

        User seba=new UserImplementation("seba",facebookMediator);
        User sebas=new UserImplementation("sebas",facebookMediator);
        User sebast=new UserImplementation("sebast",facebookMediator);
        User sebasti=new UserImplementation("sebasti",facebookMediator);

        facebookMediator.registerUser(seba);
        facebookMediator.registerUser(sebas);
        facebookMediator.registerUser(sebast);
        facebookMediator.registerUser(sebasti);

        seba.send("jestem bogiem");

    }
}
