package com.kstopa.task;

import com.kstopa.employee.Employee;
import java.util.Comparator;

public class UnitsOfWorkComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.reportWork().getUnitsOfWork() - e2.reportWork().getUnitsOfWork();
    }
}