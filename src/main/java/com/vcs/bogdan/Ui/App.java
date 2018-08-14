package com.vcs.bogdan.Ui;

import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Beans.ListData.EmployeeList;
import com.vcs.bogdan.Beans.ListData.PeriodList;
import com.vcs.bogdan.Beans.ListData.TimeList;
import com.vcs.bogdan.Service.CalcSalary;
import com.vcs.bogdan.Service.MySQL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Beans.Enums.JobEvenType.START;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.DAY;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.HOUR;
import static com.vcs.bogdan.Beans.Enums.SalaryCalcType.MONTH;

public class App {

    private static final String PERIOD = "Periodas";
    private static final String EMPLOYEE = "Darbuotojas";
    private static final String INCOME = "Iplaukos";
    private static final String DEDUCTION = "Atskaitymai";
    private static final String TAX = "Pajamu mokestis";
    private static final String SOCIAL_INSURANCE = "Socialinis draudimas";
    private static final String OUT = "Ismokejimas";
    private static final String SPACE = " ";
//    public static final String PATH = "D:\\Java\\Dakas\\src\\main\\java\\com\\vcs\\bogdan\\Beans\\data.txt";

    public static void main(String[] args) {

        CalcSalary calcSalary = new CalcSalary();

        MySQL mySQL = new MySQL();

            mySQL.addData(new Month(201701, 18, 143, 400, 2.45, 1.5, 2));
            mySQL.addData(new Month(201701, 18, 143, 400, 2.45, 1.5, 2));
            mySQL.addData(new Month(201801, 18, 143, 412.14, 2.45, 1.5, 2));
            mySQL.addData(new Month(201803, 20, 143, 400, 2.45, 1.5, 2));


        EmployeeList employees = new EmployeeList();
        Employee employee = employees.getEmployee("111");

        List<Employee> employeeList = new ArrayList();
        Employee employee1 = new Employee("111", "Bogdan", "Gerasimovic",
                START, DAY, 20180101, 8, 5.21, true, 0, 3, 0);
        Employee employee2 = new Employee("112", "Jonas", "Jonaitis",
                START, HOUR, 20170501, 8, 60.05, true, 0, 3, 0);
        Employee employee3 = new Employee("113", "Laimonas", "Jankauskas",
                START, MONTH, 20180224, 4, 18, true, 0, 4, 0);

        PeriodList periods = new PeriodList();
        Period period = periods.getPeriod(201801);

        TimeList timeList = new TimeList();

        PayRoll payRoll = new PayRoll();
        payRoll.setMonth(period.getId());
        payRoll.setEmployeeName(employee.getName() + SPACE + employee.getSurname());
        payRoll.setIncome(calcSalary.getIncomeWage(employee, timeList, period));
        payRoll.setDeductTax(calcSalary.getIncomeTax(payRoll.getIncome(), employee, period.getTax()));
        double deductInsurance = calcSalary.getSocialInsuranceDeductionFromEmployee(payRoll.getIncome(), employee, period) +
                calcSalary.getHealthInsuranceDeductionFromEmployee(payRoll.getIncome(), period.getInsurance()) +
                calcSalary.getGuaranteeFundDeductionSum(payRoll.getIncome(), period.getInsurance());
        payRoll.setDeductInsurance(deductInsurance);
        payRoll.setOut(payRoll.getIncome() - payRoll.getDeductTax() - payRoll.getDeductInsurance());

        printPayRoll(payRoll);
    }

    private static void printPayRoll(PayRoll payRoll) {

        Table tb = new Table();
        tb.column = payRoll.getEmployeeName().length();

        print(PERIOD + SPACE + payRoll.getMonth());
        print(EMPLOYEE + SPACE + payRoll.getEmployeeName());
        print(INCOME + SPACE + payRoll.getIncome());
        print(DEDUCTION);
        print(TAX + SPACE + payRoll.getDeductTax());
        print(SOCIAL_INSURANCE + SPACE + payRoll.getDeductInsurance());
        print(OUT + SPACE + payRoll.getOut());
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

}