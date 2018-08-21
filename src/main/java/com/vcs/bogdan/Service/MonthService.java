package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Month;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class MonthService implements DBService<Month> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO month Values(?,?,?,?,?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE month SET workDays =?, workHours =?, min =?, hourlyMin =?, moreTimeCoefficient =?, redDayCoefficient =? WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM month WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM month";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM month WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";
    private static final String ID = "id";
    private static final String WORK_DAYS = "workDays";
    private static final String WORK_HOURS = "workHours";
    private static final String MIN = "min";
    private static final String HOURLY_MIN = "hourlyMin";
    private static final String MORE_TIME = "moreTimeCoefficient";
    private static final String RED_DAY = "redDayCoefficient";

    @Override
    public Month get(List<Object> id) {
        return null;
    }

    @Override
    public Month get(String id) {
        Month month = new Month();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                month.setId(rs.getString(ID));
                month.setWorkDays(rs.getInt(WORK_DAYS));
                month.setWorkHours(rs.getInt(WORK_HOURS));
                month.setMin(rs.getDouble(MIN));
                month.setHourlyMin(rs.getDouble(HOURLY_MIN));
                month.setMoreTimeCoefficient(rs.getDouble(MORE_TIME));
                month.setRedDayCoefficient(rs.getDouble(RED_DAY));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return month;
    }

    @Override
    public void add(Month month) {
        String id = month.getId();
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
                preparedStatement.setObject(index++, month.getId());
            }
            preparedStatement.setObject(index++, month.getWorkDays());
            preparedStatement.setObject(index++, month.getWorkHours());
            preparedStatement.setObject(index++, month.getMin());
            preparedStatement.setObject(index++, month.getHourlyMin());
            preparedStatement.setObject(index++, month.getMoreTimeCoefficient());
            preparedStatement.setObject(index, month.getRedDayCoefficient());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Month> getAll() {
        List<Month> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Month month = new Month();
                month.setId(rs.getString(ID));
                month.setWorkDays(rs.getInt(WORK_DAYS));
                month.setWorkHours(rs.getInt(WORK_HOURS));
                month.setMin(rs.getDouble(MIN));
                month.setHourlyMin(rs.getDouble(HOURLY_MIN));
                month.setMoreTimeCoefficient(rs.getDouble(MORE_TIME));
                month.setRedDayCoefficient(rs.getDouble(RED_DAY));
                result.add(month);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void remove(List<Object> id) {}

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


