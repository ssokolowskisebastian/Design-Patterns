package creational.prototype2;

public class PHPBook extends Book {

    static String topic="PHP";



    Object copy() {
         PHPBook copy=new PHPBook();
         return copy;
    }

    @Override
    public String toString() {
        return "PHPBook{" +
                "title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
