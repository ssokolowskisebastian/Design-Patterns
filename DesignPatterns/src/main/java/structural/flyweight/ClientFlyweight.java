package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static structural.flyweight.Shapes.*;

public class ClientFlyweight {
    public static void main(String [] args){
        List<Shape> shapes=new ArrayList<Shape>();
        ShapeFactory shapeFactory=new ShapeFactory();

        shapes.add(shapeFactory.getShape(CIRCLE));
        shapes.add(shapeFactory.getShape(CIRCLE));
        shapes.add(shapeFactory.getShape(CIRCLE));
        shapes.add(shapeFactory.getShape(SQUARE));
        shapes.add(shapeFactory.getShape(POINT));
        shapes.add(shapeFactory.getShape(SQUARE));
        shapes.add(shapeFactory.getShape(POINT));
        shapes.add(shapeFactory.getShape(POINT));
        Random random=new Random();
        for(Shape s: shapes){
            int x=random.nextInt(100);
            int y=random.nextInt(100);
            System.out.println(s.draw(x,y));
        }

    }
}
