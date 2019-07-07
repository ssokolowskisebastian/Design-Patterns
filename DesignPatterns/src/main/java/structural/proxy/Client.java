package structural.proxy;

public class Client {


    public static void main(String[] args) {
        Image im = new RealImage("hf");
        im.displayImage();

        Image p1 = new ProxyImage("photo1");
        Image p2 = new ProxyImage("photo2");

        p1.displayImage();
        p1.displayImage();
        p2.displayImage();
        p2.displayImage();
        p1.displayImage();
        p1.displayImage();

    }
}
