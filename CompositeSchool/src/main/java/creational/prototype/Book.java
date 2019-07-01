package creational.prototype;

public class Book {
    String title;
    int id;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
