package com.S302N1;

import java.util.List;
import java.util.ArrayList;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer){
        this.observers.add(observer);
    }

    void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    void notifyObservers(String message){
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
