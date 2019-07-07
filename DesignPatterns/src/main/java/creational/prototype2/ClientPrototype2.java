package creational.prototype2;

public class ClientPrototype2 {
    public static void main(String[] args) {
        Book book1=new PHPBook();
        Book book2=new JavaBook();


        book1.copy();

        book1.setTitle("book3");
        book2.setTitle("book2");
        System.out.println(book1);
        System.out.println(book2);
    }
}
