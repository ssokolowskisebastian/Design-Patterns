package creational.builder2;

public  class CarBuilder {
    int year;
    CarColor color;
    int price;

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(CarColor color) {
        this.color = color;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    public Car getCar(){
        return new Car(year,color,price);
    }
}
