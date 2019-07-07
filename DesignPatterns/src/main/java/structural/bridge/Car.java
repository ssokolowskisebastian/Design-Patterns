package structural.bridge;

public abstract class Car {

    Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract String showDetails();

}
