package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExercisesList implements ObservableHw {

    private final List<ObserverHw> observers;
    private final List<String> exercises;
    private final String name;

    public ExercisesList(String name) {
        observers = new ArrayList<>();
        this.exercises = new ArrayList<>();
        this.name = name;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(ObserverHw observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(ObserverHw observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHw observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return exercises;
    }

    public String getName() {
        return name;
    }
}

