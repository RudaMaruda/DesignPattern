package observer;

import java.util.LinkedList;
import java.util.List;

public class Observable {
    //obiekt ktory moze byc obserwowany - observable

    // lista osob ktore obserwuje
    List<Observer> observers;

    public Observable() {
        this.observers = new LinkedList<>();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }
    //metoda notify do aktualizacji
    public void notifyObserver(){
        observers.forEach(Observer::update);
    }
}
