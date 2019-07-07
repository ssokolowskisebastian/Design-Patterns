package structural.adapter;

public class IPhoneCharger {

    public String charge(IPhone iPhone){
        return iPhone.charge();
    }
}
