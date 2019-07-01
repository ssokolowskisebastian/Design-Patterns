package creational.builder;

public class ClientBuilder {
    public static void main(String[] args) {


        Car car = new CarBuilder().setMake("sdvbk").getCar();
        System.out.println(car);

    }

}
