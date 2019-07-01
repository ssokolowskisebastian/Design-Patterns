package pizzaIngredientsFactory;

public interface PizzaIngredientsFactory {

    Dough createDought();
    Sauce createSauce();
    Cheese createCheese();
}
