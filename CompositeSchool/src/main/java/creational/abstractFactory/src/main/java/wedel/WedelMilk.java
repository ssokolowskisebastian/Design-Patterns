package wedel;

import products.Chocolate;

public class WedelMilk extends Chocolate {
    public Chocolate getChocolate() {
        return new WedelMilk();
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

    public String addMilk(){
        return "adding wedel milk";
    }
}
