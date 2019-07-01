package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> ledTVs=new ArrayList<Memento>();

    void addMemento(Memento memento){
        ledTVs.add(memento);
        System.out.println("LedTV"+ledTVs);
    }




}
