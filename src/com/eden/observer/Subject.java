package com.eden.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:16:22
 */

public class Subject {

    private int state;

    private List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
