package com.kstopa.employee;

import com.kstopa.task.Report;
import com.kstopa.task.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee implements Employee {
    private final Role role;
    private final String firstname;
    private final String surname;
    private final List<Task> tasks;

    public AbstractEmployee(Role role, String firstname, String surname) {
        this.role = role;
        this.firstname = firstname;
        this.surname = surname;
        this.tasks = new ArrayList<>();
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public Report reportWork() {
        return new Report(tasks);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Employee> getSubordinates() {
        return new ArrayList<Employee>();
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.surname + " " + this.role;
    }
}
