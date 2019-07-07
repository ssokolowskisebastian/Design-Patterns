package milka;


import products.Chocolate;

public class MilkaNut extends Chocolate {
    public Chocolate getChocolate() {
        return new MilkaNut();
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

    @Override
    public String addName() {
        return super.addName();
    }


}
