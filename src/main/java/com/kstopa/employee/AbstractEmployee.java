package com.kstopa.employee;

import com.kstopa.task.Report;

public abstract class AbstractEmployee implements Employee {
    private final Role role;
    private final String firstname;
    private final String surname;
    private final Report report;

    public AbstractEmployee(Role role, String firstname, String surname){
        this.role = role;
        this.firstname = firstname;
        this.surname = surname;
        this.report = new Report();

    }
    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public String getSurname() { return surname; }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public Report reportWork() { return report; }

    @Override
    public String toString() {
        return this.firstname + " " + this.surname + " " + this.role;
    }
}
