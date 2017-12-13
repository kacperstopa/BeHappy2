package com.kstopa.employee;

public class EmployeeGenerator {

    private final NameGenerator nameGenerator = new NameGenerator();

    public TeamManager getManager(int size) {
        return new TeamManager(Role.TEAM_LEADER, nameGenerator.getFirstname(), nameGenerator.getSurname(), size);
    }

    public Developer getDeveloper() {
        return new Developer(Role.DEVELOPER, nameGenerator.getFirstname(), nameGenerator.getSurname());
    }
}
