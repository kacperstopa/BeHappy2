package com.kstopa.employee;

import com.kstopa.task.Task;

public class Developer extends AbstractEmployee {
    public Developer(Role role, String firstname, String surname) {
        super(role, firstname, surname);
    }

    @Override
    public void assign(Task task) {
        System.out.println(this + ": completed task " + task.getDescription() + " " + task.getUnitsOfWork() + " unitsOfWork");
        this.addTask(task);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
