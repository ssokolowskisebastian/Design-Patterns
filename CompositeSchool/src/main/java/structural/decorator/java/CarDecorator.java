package structural.decorator.java;



public abstract class CarDecorator implements Car {

    public Car carToBeDecorated;

    public CarDecorator(Car carToBeDecorated) {
        this.carToBeDecorated = carToBeDecorated;
    }

    public int getCost(){
        return carToBeDecorated.getCost();
    }

    public String getDescription(){
        return carToBeDecorated.getDescription();
    }
}
