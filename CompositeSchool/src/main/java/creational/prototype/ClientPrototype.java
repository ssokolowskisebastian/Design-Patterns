package creational.prototype;

public class ClientPrototype {

    public static void main(String[] args) {
        BookShop bookShop=new BookShop();
        bookShop.setName("BookShop");
        bookShop.loadData();


        BookShop bookShop1=bookShop.copy();
        bookShop1.setName("BookShop1");

        bookShop.books.remove(2);
        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}
