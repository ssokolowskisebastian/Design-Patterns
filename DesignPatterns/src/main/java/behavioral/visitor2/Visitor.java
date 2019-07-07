package behavioral.visitor2;

public interface Visitor {
    void visit(Pasta p);
    void visit(Pizza p);
    void visit(Burger b);

}
