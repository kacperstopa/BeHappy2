package com.kstopa.employee;

import com.kstopa.task.Report;
import com.kstopa.task.Task;

public interface Employee {

    public Role getRole();
    public String getFirstname();
    public String getSurname();
    public void assign(Task task);
    public Report reportWork();

}
