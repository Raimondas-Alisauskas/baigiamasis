package com.vcs.bogdan.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL_REMOTE_MYSQL = "jdbc:mysql://78.56.120.176:3306/dakas_db";
    private static final String URL_LOCAL_MYSQL = "jdbc:mysql://localhost:3306/dakas_db";
    private static final String USER_REMOTE = "remote";
    private static final String PASSWORD_REMOTE = USER_REMOTE;
    private static final String USER_LOCAL = "root";
    private static final String PASSWORD_LOCAL = "Ko00mlok";

    static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public void makeJDBCConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
//            log("Congrats - Seems your MySQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e) {
            log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
            e.printStackTrace();
            return;
        }

        try {
            // DriverManager: The basic service for managing a set of JDBC drivers.
            connection = DriverManager.getConnection(URL_LOCAL_MYSQL, USER_LOCAL, PASSWORD_LOCAL);
            if (connection != null) {
//                log("Connection Successful!");
            } else {
                log("Failed to make connection!");
            }
        } catch (SQLException e) {
            log("MySQL Connection Failed!");
            e.printStackTrace();
            return;
        }

    }

    private static void log(String string) {
        System.out.println(string);
    }
}
