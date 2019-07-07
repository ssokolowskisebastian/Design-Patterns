package creational.prototype2;

public class JavaBook extends Book {
    String topic;

    String construct() {
        this.topic = "JAVA";
        return topic;
    }

    Object copy() {
        PHPBook copy=new PHPBook();
        return copy;
    }

    @Override
    public String toString() {
        return "JavaBook{" +
                "title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
