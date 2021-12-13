package com.greenfoxacademy.printable;

public class Todo implements Printable{
    private String task;
    private String priority;
    private boolean isDone;

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    private String getTask() {
        return task;
    }

    private String getPriority() {
        return priority;
    }

    private boolean isDone() {
        return isDone;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + getTask() + " | Priority: " + getPriority() + " | Done: " + isDone());
    }
}
