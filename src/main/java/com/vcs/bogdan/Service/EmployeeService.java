package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class EmployeeService implements DBService<Employee> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO employee Values(?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE employee " +
            "SET eventType =?, calcType =?, dayHours =?, wage =?, isMain =?, socialInsurance =?, tax =?, pnpd =? " +
            "WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM employee WHERE id =? AND date =?";
    private static final String SELECT_BY_ID_QUERY_STATEMENT = "SELECT * FROM employee WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM employee";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM employee WHERE id =? AND date =?";
    private static final String INSERT = "I";
    private static final String ID = "id";
    private static final String DATE = "date";
    private static final String EVENT_TYPE = "eventType";
    private static final String CALC_TYPE = "calcType";
    private static final String DAY_HOURS = "dayHours";
    private static final String WAGE = "wage";
    private static final String MAIN = "isMain";
    private static final String INSURANCE = "socialInsurance";
    private static final String TAX = "tax";
    private static final String PNPD = "pnpd";
    private static final String AND = " AND ";

    @Override
    public Employee get(List<Object> id) {
        Employee employee = new Employee();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            for (Object key : id) {
                preparedStatement.setObject(index++, key);
            }
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getString(ID));
                employee.setEventType(rs.getString(EVENT_TYPE));
                employee.setCalcType(rs.getString(CALC_TYPE));
                employee.setDayHours(rs.getDouble(DAY_HOURS));
                employee.setWage(rs.getDouble(WAGE));
                employee.setMain(rs.getBoolean(MAIN));
                employee.setSocialInsurance(rs.getDouble(INSURANCE));
                employee.setTax(rs.getDouble(TAX));
                employee.setPnpd(rs.getDouble(PNPD));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee get(String id) {
        Employee employee = new Employee();
        try {
            preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY_STATEMENT);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getString(ID));
                employee.setDate(rs.getLong(DATE));
                employee.setEventType(rs.getString(EVENT_TYPE));
                employee.setCalcType(rs.getString(CALC_TYPE));
                employee.setDayHours(rs.getDouble(DAY_HOURS));
                employee.setWage(rs.getDouble(WAGE));
                employee.setMain(rs.getBoolean(MAIN));
                employee.setSocialInsurance(rs.getDouble(INSURANCE));
                employee.setTax(rs.getDouble(TAX));
                employee.setPnpd(rs.getDouble(PNPD));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void add(Employee employee) {

        List<Object> id = new ArrayList();
        id.add(employee.getId());
        id.add(employee.getDate());
        String queryStatement = "";

        if (StringUtils.isNullOrEmpty(get(id).getId())) {
            queryStatement = INSERT_QUERY_STATEMENT;
        } else {
            queryStatement = UPDATE_QUERY_STATEMENT + employee.getId() + AND + DATE + "=" + employee.getDate();
        }

        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(queryStatement);
            if (queryStatement.substring(0, 1).equals(INSERT)) {
                preparedStatement.setObject(index++, employee.getId());
                preparedStatement.setObject(index++, employee.getDate());
            }
            preparedStatement.setObject(index++, employee.getEventType().toString());
            preparedStatement.setObject(index++, employee.getCalcType().toString());
            preparedStatement.setObject(index++, employee.getDayHours());
            preparedStatement.setObject(index++, employee.getWage());
            preparedStatement.setObject(index++, employee.isMain());
            preparedStatement.setObject(index++, employee.getSocialInsurance());
            preparedStatement.setObject(index++, employee.getTax());
            preparedStatement.setObject(index, employee.getPnpd());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Employee> getAll() {
        List<Employee> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getString(ID));
                employee.setDate(rs.getLong(DATE));
                employee.setEventType(rs.getString(EVENT_TYPE));
                employee.setCalcType(rs.getString(CALC_TYPE));
                employee.setDayHours(rs.getInt(DAY_HOURS));
                employee.setWage(rs.getDouble(WAGE));
                employee.setMain(rs.getBoolean(MAIN));
                employee.setSocialInsurance(rs.getDouble(INSURANCE));
                employee.setTax(rs.getDouble(TAX));
                employee.setPnpd(rs.getDouble(PNPD));
                result.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void remove(List<Object> id) {

        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(DELETE_QUERY_STATEMENT);
            for (Object key : id) {
                preparedStatement.setObject(index++, key);
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
    }

}