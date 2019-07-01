package structural.bridge;

public class Coupe extends Car {

    public Coupe(Make make) {
        super(make);
    }

    String showDetails() {
        return make.setName()+ " Coupe " ;
    }


}
