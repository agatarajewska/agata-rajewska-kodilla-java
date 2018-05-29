package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHw {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(ExercisesList exercisesList) {
        System.out.println(name + ": New exercise in box " + exercisesList.getName() + "\n" +
                " (total: " + exercisesList.getMessages().size() + " exercises)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

