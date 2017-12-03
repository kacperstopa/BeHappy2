package com.kstopa;

import com.kstopa.company.CompanyGenerator;
import com.kstopa.employee.TeamManager;
import com.kstopa.task.Task;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1 || !Pattern.compile("[0-9]+").matcher(args[0]).matches()) throw new IllegalArgumentException("Invalid arguments. Argument should be a single number");
        CompanyGenerator companyGenerator = new CompanyGenerator();
        TeamManager ceo = companyGenerator.getCompany(Integer.parseInt(args[0]));
        ceo.assign(new Task("Task1", 15));
        ceo.assign(new Task("Task2", 10));
        System.out.println(ceo.reportWork());
    }
}
