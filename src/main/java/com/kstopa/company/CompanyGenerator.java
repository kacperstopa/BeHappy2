package com.kstopa.company;

import com.kstopa.employee.EmployeeGenerator;
import com.kstopa.employee.Manager;
import com.kstopa.employee.TeamManager;

public class CompanyGenerator {
    private final EmployeeGenerator employeeGenerator = new EmployeeGenerator();

    public TeamManager getCompany(int level) {
        TeamManager ceo = employeeGenerator.getManager(2);
        addLevels(ceo, level-1);
        return ceo;
    }

    private void addLevels(Manager manager, int level){
        if (level <= 1){
            manager.hire(employeeGenerator.getDeveloper());
            manager.hire(employeeGenerator.getDeveloper());
        } else {
            TeamManager manager1 = employeeGenerator.getManager(2);
            TeamManager manager2 = employeeGenerator.getManager(2);

            manager.hire(manager1);
            manager.hire(manager2);

            addLevels(manager1, level-1);
            addLevels(manager2, level-1);
        }

    }
}
