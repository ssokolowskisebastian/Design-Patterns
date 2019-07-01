package creational.builder;

public class Car {

    int price;
    String make;
    int year;

    public Car(int price, String make, int year) {
        this.price = price;
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
