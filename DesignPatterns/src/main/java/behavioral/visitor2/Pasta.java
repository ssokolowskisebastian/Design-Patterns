package behavioral.visitor2;

public class Pasta implements Visitable {
    double pastaPrice;

    public Pasta(double pastaPrice) {
        this.pastaPrice = pastaPrice;
    }

    public double getPastaPrice() {
        return pastaPrice;
    }

    public void setPastaPrice(double pastaPrice) {
        this.pastaPrice = pastaPrice;
    }



    public void accept(Visitor v) {
        v.visit(this);

    }
}
