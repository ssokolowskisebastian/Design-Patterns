package behavioral.mediator;

public class UserImplementation extends User {


    public UserImplementation(String name, FacebookMediator facebookMediator) {
        super(name, facebookMediator);
    }

    public void send(String msg) {



        System.out.println(name+" sent "+ msg);
        facebookMediator.sendMessage(this,msg);



    }

    public void receive(String msg) {

        System.out.println(name+" received "+msg);

    }
}
