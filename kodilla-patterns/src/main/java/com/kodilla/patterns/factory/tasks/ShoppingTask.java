package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final private String taskName;
    final private String whatToBuy;
    final private double quantity;

    private boolean done;

    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.done = false;
    }

    @Override
    public void executeTask() {
        this.done = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
