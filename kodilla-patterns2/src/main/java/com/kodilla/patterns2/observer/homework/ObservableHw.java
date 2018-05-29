package com.kodilla.patterns2.observer.homework;

public interface ObservableHw {

    void registerObserver(ObserverHw observer);
    void notifyObserver();
    void removeObserver(ObserverHw observer);
}
