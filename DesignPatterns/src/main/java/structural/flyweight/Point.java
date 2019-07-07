package structural.flyweight;

public class Point implements Shape {
    public String draw(int x, int y) {
        return "Point ("+x+","+y+")";
    }
}
