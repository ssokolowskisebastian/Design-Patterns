package wedel;


import products.Chocolate;

public class WedelNut extends Chocolate {
    public Chocolate getChocolate() {
        addNut();
        return new WedelNut();
    }

    @Override
    public String addFat() {
        return super.addFat();
    }

    @Override
    public String addSugar() {
        return super.addSugar();
    }

    @Override
    public String addCocoa() {
        return super.addCocoa();
    }

    public String addNut(){
        return "adding wedel nuts..";
    }
}
