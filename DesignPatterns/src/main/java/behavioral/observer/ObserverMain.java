package behavioral.observer;


import java.lang.reflect.Array;

import java.util.LinkedList;
import java.util.ArrayList;

public class ObserverMain {



    public static void main(String[] args) {
        JobSite jobSite=new JobSite();
        ArrayList list=new ArrayList();
        LinkedList lista=new LinkedList();


        Observer subscriber=new Subscriber("Arbeitsucher1");
        Observer subscriber2=new Subscriber("Arbeitsucher2");

        jobSite.addObserver(subscriber);
        jobSite.addObserver(subscriber2);
        jobSite.addVacancy("java3");
        jobSite.addVacancy("java1");
        jobSite.addVacancy("java2");
        jobSite.removeVacancy("java2");

        list.add(subscriber);
        list.add(1,subscriber);
        list.set(0,subscriber2);

        lista.add(0,subscriber2);
        lista.set(0,subscriber);








    }
}
