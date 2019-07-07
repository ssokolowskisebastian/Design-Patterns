package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
    List<String> vacancies=new ArrayList<String>();
    List<Observer> observers=new ArrayList<Observer>();


    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();

    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public void notifyObservers() {
        for(Observer o:observers){
            o.handleEvent(vacancies);
        }


    }
}
