package com.vcs.bogdan.Ui;

import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Service.*;

import java.util.List;

public class App {

    private static final String SPACE = " ";

    public static void main(String[] args) {

        CalcService calcService = new CalcService();

        DBConnection connection = new DBConnection();
        connection.makeJDBCConnection();

//        printPeriod(periodService.getAll());
//        printContract(contractService.getAll());
//        printTimeList(timeListService.getAll());

        List<PayRoll> payRolls = calcService.getAllPayRolls("201801");
        printPayRoll(payRolls);
    }

    private static void printPayRoll(PayRoll payRoll) {
        print("Period: " + payRoll.getPeriodId());
        print("Person: " + payRoll.getNameSurname());
        print("Income: " + payRoll.getIncome());
        print("Deduction:");
        print("Tax: " + payRoll.getTax());
        print("Social insurance" + payRoll.getInsurance());
        print("Out" + payRoll.getOut());
    }

    private static void printContract(List<Contract> contracts) {
        for (Contract e : contracts) {
            System.out.format("%s, %s, %s, %s, %s, %s\n",
                    e.getDate(), e.getEvent(), e.getType(), e.getDayHours(),
                    e.getWage(), e.isMain());
        }
    }

    private static void printContract(Contract contract) {
        System.out.format("%s, %s, %s, %s, %s, %s, %s, %s\n",
                contract.getId(), contract.getPersonId(), contract.getDate(), contract.getEvent(), contract.getType(),
                contract.getDayHours(), contract.getWage(), contract.isMain());
    }

    private static void printPerson(List<Person> list) {
        for (Person p : list) {
            System.out.format("%s, %s, %s\n", p.getId(), p.getName(), p.getSurname());
        }
    }

    private static void printPerson(Person person) {
        System.out.format("%s, %s, %s\n", person.getId(), person.getName(), person.getSurname());
    }

    private static void printPeriod(List<Period> periods) {
        for (Period p : periods) {
            System.out.format("Month %s, %s, %s, %s, %s, %s, %s\n" +
                            "Tax %s, %s, %s, %s, %s\n" +
                            "Insurance %s, %s, %s, %s, %s, %s, %s, %s\n",
                    p.getId(), p.getWorkDays(), p.getWorkHours(), p.getHourlyMin(), p.getMin(), p.getMoreTimeCoefficient(), p.getRedDayCoefficient(),
                    p.getTaxFree(), p.getPercent(), p.getBase(), p.getCoefficient(), p.getPnpd(),
                    p.getHealthEmployee(), p.getHealthNewEmployee(), p.getHealthEmployer(), p.getSocialEmployee(),
                    p.getSocialEmployer(), p.getGuaranteeFund(), p.getSickPayCoefficient(), p.getSickPayDay());
            System.out.println("----------------------------------------------------");
        }
    }

    private static void printTimeList(List<TimeList> timeLists) {

        for (int i = 0; i < timeLists.size(); i++) {
            System.out.format("%s, %s, %s, %s\n",
                    timeLists.get(i).getPersonId(), timeLists.get(i).getDate(), timeLists.get(i).getName(), timeLists.get(i).getValue());
        }
    }

    private static void printPayRoll(List<PayRoll> payRolls) {
        for (PayRoll p : payRolls) {
            System.out.format("%s, %s, %s, %s\n",
                    p.getPeriodId(), p.getNameSurname(), p.getIncome(), p.getOut());
        }
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}