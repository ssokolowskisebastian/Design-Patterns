package behavioral.interpreter;

public class HexExpression implements Expression {
    int number;

    public HexExpression(int number) {
        this.number = number;
    }

    public String interpret() {
        return Integer.toHexString(number);
    }
}
