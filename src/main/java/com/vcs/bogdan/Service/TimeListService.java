package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.TimeList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class TimeListService implements DBService<TimeList> {
    
    private static final String INSERT_INTO = "INSERT INTO timeList Values(?,?,?,?,?)";
    private static final String UPDATE = "UPDATE timeList SET id =?, date =?, personId =?, name =?, value =? WHERE id =";
    private static final String SELECT = "SELECT * FROM timeList WHERE id =";
    private static final String SELECT_ALL = "SELECT * FROM timeList";
    private static final String DELETE = "DELETE FROM timeList WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";

    @Override
    public TimeList get(String id) {
        TimeList timeList = new TimeList();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT + id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                timeList.setId(rs.getString("id"));
                timeList.setDate(rs.getLong("date"));
                timeList.setPersonId(rs.getString("personId"));
                timeList.setName(rs.getString("name"));
                timeList.setValue(rs.getDouble("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return timeList;
    }

    @Override
    public void add(TimeList timeList) {
        String id = timeList.getId();
        String queryStatement = "";

        if (StringUtils.isNullOrEmpty(get(id).getId())) {
            queryStatement = INSERT_INTO;
        } else {
            queryStatement = UPDATE + id;
        }

        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(queryStatement);
            if (queryStatement.substring(0, 1).equals(INSERT)) {
                preparedStatement.setObject(index++, timeList.getId());
            }
            preparedStatement.setObject(index++, timeList.getDate());
            preparedStatement.setObject(index++, timeList.getPersonId());
            preparedStatement.setObject(index++, timeList.getName());
            preparedStatement.setObject(index, timeList.getValue());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TimeList> getAll() {
        List<TimeList> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TimeList timeList = new TimeList();
                timeList.setDate(rs.getLong("date"));
                timeList.setPersonId(rs.getString("personId"));
                timeList.setName(rs.getString("name"));
                timeList.setValue(rs.getDouble("value"));
                result.add(timeList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void remove(String id) {
        try {
            preparedStatement = connection.prepareStatement(DELETE + id + QUOTE);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public double getHours(List<TimeList> list, String personId, String periodId) {
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonId().equals(personId) && list.get(i).getDate() / 100 == Integer.valueOf(periodId))
                result = result + list.get(i).getValue();
        }
        return result;
    }

    public double getDays(List<TimeList> list, String personId, String periodId) {
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonId().equals(personId) && list.get(i).getDate() / 100 == Integer.valueOf(periodId))
                result++;
        }
        return result;
    }

}

