package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;
    String lastname;

    public Composite(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    List<Component> composites=new ArrayList<Component>();
    public void addComponent(Component component){
        composites.add(component);
    }

    public void showData() {

    }
}
