package structural.adapter;

public class DriveAdapter {

    public static void main(String [] args){
        AndroidCharger androidCharger=new AndroidCharger();
        IAndroid iAndroid=new SamsungS10();

        IPhoneCharger iPhoneCharger=new IPhoneCharger();
        IPhone iPhone=new IPhoneX6();

        System.out.println(androidCharger.charge(iAndroid));
        System.out.println(iPhoneCharger.charge(iPhone));

        AndroidToIPhoneAdapter androidToIPhoneAdapter=new AndroidToIPhoneAdapter(iAndroid);
        System.out.println(iPhoneCharger.charge(androidToIPhoneAdapter));

        IPhoneToAndroidAdapter iPhoneToAndroidAdapter=new IPhoneToAndroidAdapter(iPhone);
        System.out.println(androidCharger.charge(iPhoneToAndroidAdapter));




    }

}
