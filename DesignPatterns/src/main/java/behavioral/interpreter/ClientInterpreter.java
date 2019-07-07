package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClientInterpreter {
    public static void main(String[] args) {
        int number=10;
        Random random=new Random();

        int [] numbers=new int [number];
        for (int i=0;i<number;i++){
            numbers[i]=random.nextInt(100);
            Context context=new Context(numbers[i]);
            HexExpression hexExpression=new HexExpression(context.getNumber());
            BinaryExpression binaryExpression=new BinaryExpression(context.getNumber());
            System.out.println("hex: "+hexExpression.interpret()+", dec: "+numbers[i]+", bin: "+binaryExpression.interpret());
        }

    }
}
