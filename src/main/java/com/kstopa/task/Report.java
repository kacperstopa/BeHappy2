package com.kstopa.task;

import java.util.List;

public class Report {
    private final List<Task> tasks;

    public Report(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int getUnitsOfWork() {
        return tasks.stream()
                .map(Task::getUnitsOfWork)
                .reduce(0, (a, b) -> a + b);
    }

    @Override
    public String toString() {
        return tasks + " summary " + getUnitsOfWork() + " unitsOfWork";
    }
}
