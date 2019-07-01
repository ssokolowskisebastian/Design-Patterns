package structural.bridge;

public class Sedan extends Car {


    public Sedan(Make make) {
        super(make);
    }

    String showDetails() {

        return make.setName()+" Sedan";

    }
}
