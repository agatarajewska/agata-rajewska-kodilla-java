package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    final private String taskName;
    final private String color;
    final private String whatToPaint;

    private boolean done;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
