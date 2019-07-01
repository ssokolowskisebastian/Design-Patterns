package structural.adapter;

public class AndroidToIPhoneAdapter implements IPhone {

    IAndroid iAndroid;

    public AndroidToIPhoneAdapter(IAndroid iAndroid) {
        this.iAndroid = iAndroid;
    }

    public String charge() {
        return iAndroid.charge();
    }
}
