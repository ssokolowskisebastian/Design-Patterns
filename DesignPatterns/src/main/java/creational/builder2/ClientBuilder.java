package creational.builder2;

public class ClientBuilder {
    public static void main(String [] args){
        Car car=new CarBuilder().setYear(12).setColor(CarColor.RED).getCar();
        System.out.println(car);



    }
}
