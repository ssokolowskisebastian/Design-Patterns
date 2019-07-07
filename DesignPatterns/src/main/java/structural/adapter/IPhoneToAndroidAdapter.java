package structural.adapter;

public class IPhoneToAndroidAdapter implements IAndroid{
    IPhone iPhone;

    public IPhoneToAndroidAdapter(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public String charge() {
        return iPhone.charge();
    }
}
