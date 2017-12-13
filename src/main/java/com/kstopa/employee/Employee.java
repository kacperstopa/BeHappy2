package com.kstopa.employee;

import com.kstopa.task.Report;
import com.kstopa.task.Task;

import java.util.List;

public interface Employee {

    Role getRole();

    String getFirstname();

    String getSurname();

    void assign(Task task);

    Report reportWork();

    List<Employee> getSubordinates();

}
