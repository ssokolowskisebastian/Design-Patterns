package pizza;

import pizzaIngredientsFactory.Cheese;
import pizzaIngredientsFactory.Dough;
import pizzaIngredientsFactory.Sauce;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;


    public abstract void prepare();

    public void bake(){
        System.out.println("baking..");
    }
    public void cut(){
        System.out.println("cutting..");
    }
    public void box(){ System.out.println("boxing.."); }




}
