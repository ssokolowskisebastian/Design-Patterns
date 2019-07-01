package structural.decorator.java;
public class ClientDecorator {
    public static void main(String[] args){
        Car car = new SimpleCar();
        System.out.println("description: "+car.getDescription());
        System.out.println("cena: "+ car.getCost());


        car=new GazCarDecorator(car);
        System.out.println("description: "+car.getDescription());
        System.out.println("cena: "+car.getCost());

        car=new GazCarDecorator(car);
        System.out.println("description: "+car.getDescription());
        System.out.println("cena: "+car.getCost());


        car=new ClimaCarDecorator(car);
        System.out.println("description: "+car.getDescription());
        System.out.println("cena: "+car.getCost());


    }
}
