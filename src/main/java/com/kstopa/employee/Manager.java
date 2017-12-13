package com.kstopa.employee;

import java.util.List;

public interface Manager extends Employee {

    void hire(Employee employee);

    void fire(Employee employee);

    boolean canHire();

    List<Employee> getSubordinates();
}
