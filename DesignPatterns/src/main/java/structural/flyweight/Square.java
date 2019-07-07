package structural.flyweight;

public class Square implements Shape{
    public String draw(int x, int y) {
        int a=6;
        return "Square with the right top point ("+x+","+y+") and the side length "+a;
    }
}
