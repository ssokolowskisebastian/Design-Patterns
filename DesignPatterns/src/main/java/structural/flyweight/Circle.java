package structural.flyweight;

public class Circle implements Shape{

    int i;



    public String draw(int x, int y) {
        int r = ++i;
        return "Circle with center point in ("+x+","+y+") and radius "+r;
    }
}
