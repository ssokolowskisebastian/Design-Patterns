package creational.builder2;

public class Car {
    int year;
    CarColor color;


    int price;

    public Car(int year, CarColor color, int price) {
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
