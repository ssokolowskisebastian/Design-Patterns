package pizza;

public class CheesePizza extends Pizza {

    public void prepare() {

        System.out.println("Preparing .."+name+ dough+ sauce +cheese);

    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }
}
