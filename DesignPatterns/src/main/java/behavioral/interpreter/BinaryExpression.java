package behavioral.interpreter;

public class BinaryExpression implements Expression {
    int number;

    public BinaryExpression(int number) {
        this.number = number;
    }

    public String interpret() {
        return Integer.toBinaryString(number);
    }
}
