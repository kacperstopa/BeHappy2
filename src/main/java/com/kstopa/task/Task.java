package com.kstopa.task;

public class Task {
    private final String description;
    private final int unitsOfWork;

    public Task(String description, int unitsOfWork) {
        this.description = description;
        this.unitsOfWork = unitsOfWork;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOfWork() {
        return unitsOfWork;
    }

    @Override
    public String toString() {
        return this.description+", "+this.unitsOfWork + " unitsOfWork";
    }
}
