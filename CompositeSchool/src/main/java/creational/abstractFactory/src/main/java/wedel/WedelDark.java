package wedel;

import products.Chocolate;

public class WedelDark extends Chocolate {
    public Chocolate getChocolate() {
        return new WedelDark();
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

    public String addExtraCocoa(){
        return "adding wedel extra cocoa";
    }
}
