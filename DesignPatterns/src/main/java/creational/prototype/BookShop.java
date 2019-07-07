package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Copyable {
    String name;
    List<Book> books=new ArrayList<Book>();


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    void loadData(){
        for(int i=0; i<4 ; i++)

        {
            Book book=new Book();
            book.setId(i);
            book.setTitle("book " + i);
            books.add(book);
        }

    }



    public BookShop copy() {

        BookShop bookShop=new BookShop();
        for(Book b:books){
            bookShop.books.add(b);

        }
        return bookShop;
    }
}
