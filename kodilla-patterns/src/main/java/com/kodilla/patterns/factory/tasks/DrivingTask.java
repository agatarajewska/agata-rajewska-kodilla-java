package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    final private String taskName;
    final private String where;
    final private String using;

    private boolean done;

    public DrivingTask(String taskName, String where, String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
