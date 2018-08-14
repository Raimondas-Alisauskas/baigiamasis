package com.vcs.bogdan.Service;

import com.vcs.bogdan.Beans.Employee;
import com.vcs.bogdan.Beans.Month;
import com.vcs.bogdan.Beans.Person;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Crunchify.com
 * Simple Hello World MySQL Tutorial on how to make JDBC connection, Add and Retrieve Data by App Shah
 */

public class MySQL {

    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] argv) {

        try {
            log("-------- Simple Crunchify Tutorial on how to make JDBC connection to MySQL DB locally on macOS ------------");
            makeJDBCConnection();

            log("\n---------- Adding company 'Crunchify LLC' to DB ----------");
            addData(new Month(201701, 18, 143, 400, 2.45, 1.5, 2));
            addData(new Month(201801, 18, 143, 412.14, 2.45, 1.5, 2));
            addData(new Month(201803, 20, 143, 400, 2.45, 1.5, 2));


            log("\n---------- Let's get Data from DB ----------");
            getDataFromDB();

            preparedStatement.close();
            connection.close(); // connection close

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<String> getObjectFields(Object obj) {

        try {
            List<String> fieldList = new ArrayList<>();
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                fieldList.add(field.getName());
//                Object value = field.get(abc);
//                System.out.printf("%s: %s%n", name, value);
            }
            return fieldList;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static void makeJDBCConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            log("Congrats - Seems your MySQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e) {
            log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
            e.printStackTrace();
            return;
        }

        try {
            // DriverManager: The basic service for managing a set of JDBC drivers.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dakas_db", "root", "Ko00mlok");
            if (connection != null) {
                log("Connection Successful! Enjoy. Now it's time to push data");
            } else {
                log("Failed to make connection!");
            }
        } catch (SQLException e) {
            log("MySQL Connection Failed!");
            e.printStackTrace();
            return;
        }

    }

    public static void addData(Month month) {

        try {
            String insertQueryStatement = "INSERT INTO month VALUES(?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(insertQueryStatement);
            preparedStatement.setLong(1, month.getId());
            preparedStatement.setInt(2, month.getWorkDays());
            preparedStatement.setInt(3, month.getWorkHours());
            preparedStatement.setDouble(4, month.getMinMonthlyWage());
            preparedStatement.setDouble(5, month.getMinHourlyWage());
            preparedStatement.setDouble(6, month.getMoreTimeCoefficient());
            preparedStatement.setDouble(7, month.getRedDayCoefficient());

            // execute insert SQL statement
            preparedStatement.executeUpdate();
            log("" + month.getId() + " added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addData(Person person) {

        try {
            String insertQueryStatement = "INSERT INTO month VALUES(?,?,?)";

            preparedStatement = connection.prepareStatement(insertQueryStatement);
            preparedStatement.setString(1, person.getId());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setString(3, person.getSurname());

            // execute insert SQL statement
            preparedStatement.executeUpdate();
            log("" + person.getId() + " added successfully");
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addData(Employee employee) {

        try {
            String insertQueryStatement = "INSERT INTO month VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(insertQueryStatement);
            preparedStatement.setString(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getSurname());
            preparedStatement.setString(4, employee.getJobEventType().toString());
            preparedStatement.setString(5, employee.getSalaryCalcType().toString());
            preparedStatement.setLong(6, employee.getDate());
            preparedStatement.setDouble(7, employee.getDayHours());
            preparedStatement.setDouble(8, employee.getWage());
            preparedStatement.setBoolean(9, employee.isMainWorkPlace());
            preparedStatement.setDouble(10, employee.getSocialInsurance());
            preparedStatement.setDouble(11, employee.getTax());
            preparedStatement.setDouble(12, employee.getPnpd());

            // execute insert SQL statement
            preparedStatement.executeUpdate();
            log("" + employee.getId() + " added successfully");
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addData(String companyName, String address, int totalEmployee, String webSite) {

        try {
            String insertQueryStatement = "INSERT  INTO  Employee  VALUES  (?,?,?,?)";

            preparedStatement = connection.prepareStatement(insertQueryStatement);
            preparedStatement.setString(1, companyName);
            preparedStatement.setString(2, address);
            preparedStatement.setInt(3, totalEmployee);
            preparedStatement.setString(4, webSite);

            // execute insert SQL statement
            preparedStatement.executeUpdate();
            log(companyName + " added successfully");
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getDataFromDB() {

        try {
            // MySQL Select Query Tutorial
            String getQueryStatement = "SELECT * FROM employee";

            preparedStatement = connection.prepareStatement(getQueryStatement);

            // Execute the Query, and get a java ResultSet
            ResultSet rs = preparedStatement.executeQuery();

            // Let's iterate through the java ResultSet
            while (rs.next()) {
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                int employeeCount = rs.getInt("EmployeeCount");
                String website = rs.getString("Website");

                // Simply Print the results
                System.out.format("%s, %s, %s, %s\n", name, address, employeeCount, website);
            }

        } catch (

                SQLException e) {
            e.printStackTrace();
        }

    }

    // Simple log utility
    private static void log(String string) {
        System.out.println(string);

    }
}