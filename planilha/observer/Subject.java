package observer;

import java.util.ArrayList;
import java.util.List;

import classes.Célula;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Célula subject) {
        for (Observer observer : observers) {
            observer.update(subject);
        }
    }
}
