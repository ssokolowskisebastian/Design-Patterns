package structural.bridge;

public class Drive {
    public  static void main(String[]args){
        Make make=new Kia();
        Make make1=new Mercedes();

        Car car=new Sedan(make1);
        Car car1=new Coupe(make1);
        System.out.println(car.showDetails());
        System.out.println(car1.showDetails());
    }
}
