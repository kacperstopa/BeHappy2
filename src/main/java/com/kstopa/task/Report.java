package com.kstopa.task;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private final List<Task> tasks;

    public Report() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() { return tasks; }

    public int getUnitsOfWork(){
        return tasks.stream().map(task -> task.getUnitsOfWork()).reduce(0,(a,b)->a+b);
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    @Override
    public String toString() {
        return tasks+" summary " + getUnitsOfWork() + " unitsOfWork";
    }
}
