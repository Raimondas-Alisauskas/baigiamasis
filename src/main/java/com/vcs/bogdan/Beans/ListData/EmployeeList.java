package com.vcs.bogdan.Beans.ListData;

import com.vcs.bogdan.Beans.Employee;

import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Beans.Enums.JobEvenType.START;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.DAY;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.HOUR;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.MONTH;

public class EmployeeList {

    private List<Employee> employees;

    public EmployeeList() {

        Employee employee = new Employee("111", "Bogdan", "Gerasimovic",
                START, DAY, 20180101, 8, 5.21, true, 0, 3, 0);
        Employee employee2 = new Employee("112", "Jonas", "Jonaitis",
                START, HOUR, 20170501, 8, 60.05, true, 0, 3, 0);
        Employee employee3 = new Employee("113", "Laimonas", "Jankauskas",
                START, MONTH, 20180224, 4, 18, true, 0, 4, 0);

        this.employees = new ArrayList<Employee>();
        this.employees.add(employee);
        this.employees.add(employee2);
        this.employees.add(employee3);
    }

    public Employee getEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

}
