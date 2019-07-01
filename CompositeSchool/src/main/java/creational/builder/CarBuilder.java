package creational.builder;

public class CarBuilder {

    int price;
    String make;
    int year;

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }
    Car getCar(){
        return new Car(price,make,year);
    }
}
