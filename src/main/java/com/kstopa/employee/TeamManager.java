package com.kstopa.employee;

import com.kstopa.task.Task;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class TeamManager extends AbstractEmployee implements Manager {
    private final List<Employee> subordinates;
    private final int maxSubordinates;

    public TeamManager(Role role, String firstname, String surname, int maxSubordinates) {
        super(role, firstname, surname);
        this.maxSubordinates = maxSubordinates;
        subordinates = new LinkedList<>();
    }

    @Override
    public boolean canHire() {
        return subordinates.size() < maxSubordinates;
    }

    @Override
    public void hire(Employee employee) {
        if (canHire()) subordinates.add(employee);
        else throw new IllegalArgumentException("Can't hire new employee");
    }

    @Override
    public void fire(Employee employee) {
        if (subordinates.contains(employee)) {
            subordinates.remove(employee);
            if (employee.getSubordinates().size() + this.getSubordinates().size() > maxSubordinates) {
                throw new IllegalArgumentException("Can't hire employee that have too much subordinates");
            }
            subordinates.addAll(employee.getSubordinates());
            sortSubordinates();
        } else throw new NoSuchElementException("Can't fire that employee");
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void assign(Task task) {
        if (subordinates.size() == 0) throw new NoSuchElementException("Manager have no developers to assign a task");
        else {
            System.out.println(this + ": assigned to " + subordinates.get(0) + " task: " + task.getDescription() + " " + task.getUnitsOfWork() + " UnitsOfWork");
            subordinates.get(0).assign(task);
            sortSubordinates();
            this.addTask(task);
        }
    }

    private void sortSubordinates() {
        this.subordinates.sort(Comparator.comparing(e -> e.reportWork().getUnitsOfWork()));
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
