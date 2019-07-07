package milka;

import products.Chocolate;

public class MilkaMilk extends Chocolate {



    @Override
    public String addName() { setName("milka mleczna");
        return getName();
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


}
