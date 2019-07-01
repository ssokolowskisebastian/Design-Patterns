package pizzaIngredientsFactory;

public class NYIngredientesFactory implements PizzaIngredientsFactory {

    public Dough createDought() {
        return new CienkieDough();
    }

    public Sauce createSauce() {
        return new OstrySauce();
    }

    public Cheese createCheese() {
        return new BrieCheese();
    }
}
