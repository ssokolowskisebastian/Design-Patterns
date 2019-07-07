package creational.prototype2;

public abstract class Book {
    String title;
    String topic;
    abstract Object copy();

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
