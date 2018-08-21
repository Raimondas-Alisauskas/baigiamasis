package com.vcs.bogdan.Ui;

import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Service.*;

import java.util.List;

import static com.vcs.bogdan.Beans.Enums.CalcType.DAY;
import static com.vcs.bogdan.Beans.Enums.CalcType.HOUR;
import static com.vcs.bogdan.Beans.Enums.EvenType.START;
import static com.vcs.bogdan.Beans.Enums.EvenType.UPDATE;

public class App {

    private static final String SPACE = " ";

    public static void main(String[] args) {

        DBConnection connection = new DBConnection();
        connection.makeJDBCConnection();

        PersonService personService = new PersonService();
        EmployeeService employeeService = new EmployeeService();
        MonthService monthService = new MonthService();
        TaxService taxService = new TaxService();
        PeriodService periodService = new PeriodService();

        personService.add(new Person("118", "Karolis", "Amudavicius"));
//        employeeService.add(new Employee("118", 201800601, START, DAY, 8, 50.15, true, 4, 15, 0));
        printPerson(personService.get("112"));
//        printEmployee(employeeService.get("112"));

        monthService.add(new Month("201810", 21, 177, 400, 4.25, 1.5, 2));
        printMonth(monthService.getAll());

        taxService.add(new Tax("201801", 410, 0.5, 400, 15, 0));
        printPeriod(periodService.getAll());
//        printTax();


//        PayRoll payRoll = new PayRoll();
//        payRoll.setMonth(period.getId());
//        payRoll.setEmployeeName(employee.getName() + SPACE + employee.getSurname());
//        payRoll.setIncome(calcSalary.getIncomeWage(employee, timeList, period));
//        payRoll.setDeductTax(calcSalary.getIncomeTax(payRoll.getIncome(), employee, period.getTax()));
//        double deductInsurance = calcSalary.getSocialInsuranceDeductionFromEmployee(payRoll.getIncome(), employee, period) +
//                calcSalary.getHealthInsuranceDeductionFromEmployee(payRoll.getIncome(), period.getInsurance()) +
//                calcSalary.getGuaranteeFundDeductionSum(payRoll.getIncome(), period.getInsurance());
//        payRoll.setDeductInsurance(deductInsurance);
//        payRoll.setOut(payRoll.getIncome() - payRoll.getDeductTax() - payRoll.getDeductInsurance());
//
//        printPayRoll(payRoll);
    }

//    private static void printPayRoll(PayRoll payRoll) {
//
//        Structure tb = new Structure();
//        tb.column = payRoll.getEmployeeName().length();
//
//        print(PERIOD + SPACE + payRoll.getMonth());
//        print(EMPLOYEE + SPACE + payRoll.getEmployeeName());
//        print(INCOME + SPACE + payRoll.getIncome());
//        print(DEDUCTION);
//        print(TAX + SPACE + payRoll.getDeductTax());
//        print(SOCIAL_INSURANCE + SPACE + payRoll.getDeductInsurance());
//        print(OUT + SPACE + payRoll.getOut());
//    }

    private static void printEmployee(List<Employee> list) {
        for (Employee e : list) {
            System.out.format("%s, %s, %s, %s, %s, %s, %s, %s, %s\n",
                    e.getDate(), e.getEventType(), e.getCalcType(), e.getDayHours(),
                    e.getWage(), e.isMain(), e.getSocialInsurance(), e.getTax(), e.getPnpd());
        }
    }

    private static void printEmployee(Employee e) {
        System.out.format("%s, %s, %s, %s, %s, %s, %s, %s, %s\n",
                e.getDate(), e.getEventType(), e.getCalcType(), e.getDayHours(),
                e.getWage(), e.isMain(), e.getSocialInsurance(), e.getTax(), e.getPnpd());
    }

    private static void printPerson(List<Person> list) {
        for (Person p : list) {
            System.out.format("%s, %s, %s\n", p.getId(), p.getName(), p.getSurname());
        }
    }

    private static void printPerson(Person person) {
        System.out.format("%s, %s, %s\n", person.getId(), person.getName(), person.getSurname());
    }

    private static void printPeriod(List<Period> list) {
        for (Period p : list) {
            Month month = p.getMonth();
            Tax tax = p.getTax();
            Insurance ins = p.getInsurance();

            System.out.format("Month %s, %s, %s, %s, %s, %s, %s\n" +
                            "Tax %s, %s, %s, %s, %s\n" +
                            "Insurance %s, %s, %s, %s, %s, %s, %s, %s\n",
                    month.getId(), month.getWorkDays(), month.getWorkHours(), month.getHourlyMin(), month.getMin(), month.getMoreTimeCoefficient(), month.getRedDayCoefficient(),
                    tax.getTaxFree(), tax.getPercent(), tax.getBase(), tax.getCoefficient(), tax.getPnpd(),
                    ins.getHealthEmployee(), ins.getHealthNewEmployee(), ins.getHealthEmployer(), ins.getSocialEmployee(),
                    ins.getSocialEmployer(), ins.getGuaranteeFund(), ins.getSickPayCoefficient(), ins.getSickPayDay());
        }
    }

    private static void printMonth(List<Month> months) {
        for (Month m : months) {
            System.out.format("%s, %s, %s, %s, %s, %s, %s\n",
                    m.getId(), m.getWorkDays(), m.getWorkHours(), m.getHourlyMin(), m.getMin(), m.getMoreTimeCoefficient(), m.getRedDayCoefficient());
        }
    }

    private static void printTax(Tax tax) {
        System.out.format("%s, %s, %s, %s, %s, %s\n",
                tax.getId(), tax.getTaxFree(), tax.getCoefficient(), tax.getBase(), tax.getPercent(), tax.getPnpd());
    }

    private static void printTimeList(List<Object> data) {

        for (int i = 0; i < data.size(); i++) {
            System.out.format("%s, %s, %s, %s\n",
                    data.get(i), data.get(i++), data.get(i++), data.get(i++));
        }
    }
}