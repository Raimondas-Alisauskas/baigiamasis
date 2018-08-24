package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Period;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class PeriodService implements DBService<Period> {

    private static final String INSERT_INTO = "INSERT INTO period Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE period " +
            "SET workDays =?, workHours =?, min =?, hourlyMin =?, moreTimeCoefficient =?, redDayCoefficient =?," +
            "taxFree =?, coefficient =?, base =?, percent =?, pnpd =?," +
            "healthEmployee =?, healthNewEmployee =?, healthEmployer =?, socialEmployee =?, socialEmployer =?, guaranteeFund =?, sickPayCoefficient =?, sickPayDay =? " +
            "WHERE id =";
    private static final String SELECT = "SELECT * FROM period WHERE id =";
    private static final String SELECT_ALL = "SELECT * FROM period";
    private static final String DELETE = "DELETE FROM period WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";

    @Override
    public Period get(String id) {
        Period result = new Period();
        try {
            preparedStatement = connection.prepareStatement(SELECT + id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               result = setPeriod(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void add(Period period) {
        String id = period.getId();
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
                preparedStatement.setObject(index++, period.getId());
            }
            preparedStatement.setObject(index++, period.getWorkDays());
            preparedStatement.setObject(index++, period.getWorkHours());
            preparedStatement.setObject(index++, period.getMin());
            preparedStatement.setObject(index++, period.getHourlyMin());
            preparedStatement.setObject(index++, period.getMoreTimeCoefficient());
            preparedStatement.setObject(index++, period.getRedDayCoefficient());
            preparedStatement.setObject(index++, period.getTaxFree());
            preparedStatement.setObject(index++, period.getCoefficient());
            preparedStatement.setObject(index++, period.getBase());
            preparedStatement.setObject(index++, period.getPercent());
            preparedStatement.setObject(index++, period.getPnpd());
            preparedStatement.setObject(index++, period.getHealthEmployee());
            preparedStatement.setObject(index++, period.getHealthNewEmployee());
            preparedStatement.setObject(index++, period.getHealthEmployer());
            preparedStatement.setObject(index++, period.getSocialEmployee());
            preparedStatement.setObject(index++, period.getSocialEmployer());
            preparedStatement.setObject(index++, period.getGuaranteeFund());
            preparedStatement.setObject(index++, period.getSickPayCoefficient());
            preparedStatement.setObject(index, period.getRedDayCoefficient());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Period> getAll() {
        List<Period> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                result.add(setPeriod(rs));
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

    private Period setPeriod(ResultSet rs) throws SQLException {
        Period result = new Period();
        result.setId(rs.getString("id"));
        result.setWorkHours(rs.getInt("workDays"));
        result.setWorkDays(rs.getInt("workHours"));
        result.setMin(rs.getDouble("min"));
        result.setHourlyMin(rs.getDouble("hourlyMin"));
        result.setMoreTimeCoefficient(rs.getDouble("moreTimeCoefficient"));
        result.setRedDayCoefficient(rs.getDouble("redDayCoefficient"));
        result.setTaxFree(rs.getInt("taxFree"));
        result.setCoefficient(rs.getInt("coefficient"));
        result.setBase(rs.getDouble("base"));
        result.setPercent(rs.getDouble("percent"));
        result.setPnpd(rs.getDouble("pnpd"));
        result.setHealthEmployee(rs.getDouble("healthEmployee"));
        result.setHealthNewEmployee(rs.getDouble("healthNewEmployee"));
        result.setHealthEmployer(rs.getDouble("healthEmployer"));
        result.setSocialEmployee(rs.getDouble("socialEmployee"));
        result.setSocialEmployer(rs.getDouble("socialEmployer"));
        result.setGuaranteeFund(rs.getDouble("guaranteeFund"));
        result.setSickPayCoefficient(rs.getDouble("sickPayCoefficient"));
        result.setSickPayDay(rs.getInt("sickPayDay"));
        return result;
    }
}
