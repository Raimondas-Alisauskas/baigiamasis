package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Insurance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class InsuranceService implements DBService<Insurance> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO insurance Values(?,?,?,?,?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE insurance " +
            "SET healthEmployee =?, healthNewEmployee =?, healthEmployer =?, socialEmployee =?, socialEmployer =?, sickPayCoefficient =?, sickPayDay =? " +
            "WHERE id =?";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM insurance WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM insurance";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM insurance WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";
    private static final String ID = "id";
    private static final String HEALTH_EMPLOYEE = "healthEmployee";
    private static final String HEALTH_NEW_EMPLOYEE = "healthNewEmployee";
    private static final String HEALTH_EMPLOYER = "healthEmployer";
    private static final String SOC_EMPLOYEE = "socialEmployee";
    private static final String SOC_EMPLOYER = "socialEmployer";
    private static final String SICK_COEFFICIENT = "sickPayCoefficient";
    private static final String SICK_DAY = "sickPayDay";

    @Override
    public Insurance get(List<Object> id) {
        return null;
    }

    @Override
    public Insurance get(String id) {
        Insurance insurance = new Insurance();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                insurance.setId(rs.getString(ID));
                insurance.setHealthEmployee(rs.getDouble(HEALTH_EMPLOYEE));
                insurance.setHealthNewEmployee(rs.getDouble(HEALTH_NEW_EMPLOYEE));
                insurance.setHealthEmployer(rs.getDouble(HEALTH_EMPLOYER));
                insurance.setSocialEmployee(rs.getDouble(SOC_EMPLOYEE));
                insurance.setSocialEmployer(rs.getDouble(SOC_EMPLOYER));
                insurance.setSickPayCoefficient(rs.getDouble(SICK_COEFFICIENT));
                insurance.setSickPayDay(rs.getInt(SICK_DAY));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insurance;
    }

    @Override
    public void add(Insurance insurance) {
        String id = insurance.getId();
        String queryStatement = "";

        if (StringUtils.isNullOrEmpty(get(id).getId())) {
            queryStatement = INSERT_QUERY_STATEMENT;
        } else {
            queryStatement = UPDATE_QUERY_STATEMENT + id;
        }

        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(queryStatement);
            if (queryStatement.substring(0, 1).equals(INSERT)) {
                preparedStatement.setObject(index++, insurance.getId());
            }
            preparedStatement.setObject(index++, insurance.getHealthEmployee());
            preparedStatement.setObject(index++, insurance.getHealthNewEmployee());
            preparedStatement.setObject(index++, insurance.getHealthEmployer());
            preparedStatement.setObject(index++, insurance.getSocialEmployee());
            preparedStatement.setObject(index++, insurance.getSocialEmployer());
            preparedStatement.setObject(index++, insurance.getSickPayCoefficient());
            preparedStatement.setObject(index, insurance.getSickPayDay());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Insurance> getAll() {
        List<Insurance> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Insurance insurance = new Insurance();
                insurance.setId(rs.getString(ID));
                insurance.setHealthEmployee(rs.getInt(HEALTH_EMPLOYEE));
                insurance.setHealthNewEmployee(rs.getInt(HEALTH_NEW_EMPLOYEE));
                insurance.setHealthEmployer(rs.getDouble(HEALTH_EMPLOYER));
                insurance.setSocialEmployee(rs.getDouble(SOC_EMPLOYEE));
                insurance.setSocialEmployer(rs.getDouble(SOC_EMPLOYER));
                insurance.setSickPayCoefficient(rs.getDouble(SICK_COEFFICIENT));
                insurance.setSickPayDay(rs.getInt(SICK_DAY));
                result.add(insurance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void remove(List<Object> id) {
    }

    @Override
    public void remove(String id) {

        try {
            preparedStatement = connection.prepareStatement(DELETE_QUERY_STATEMENT + id + QUOTE);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
