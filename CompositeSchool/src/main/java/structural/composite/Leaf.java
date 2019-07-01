package structural.composite;

public class Leaf implements Component {

    String name;
    String lastname;

    public Leaf(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void showData() {

        System.out.println(name+" "+lastname);

    }
}
