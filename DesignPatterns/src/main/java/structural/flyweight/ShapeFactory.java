package structural.flyweight;

import java.util.*;

public class ShapeFactory {

    private final Map<Shapes, Shape> shapes = new HashMap<Shapes, Shape>();


    public Shape getShape(Shapes shapeName) {
        Shape shape = shapes.get(shapeName);
        if(shape==null) {
            switch (shapeName) {
                case SQUARE:
                    shape = new Square();
                    break;
                case POINT:
                    shape = new Point();
                    break;
                case CIRCLE:
                    shape = new Circle();
                    break;
            }
            shapes.put(shapeName, shape);

        }

        return shape;

    }



}


