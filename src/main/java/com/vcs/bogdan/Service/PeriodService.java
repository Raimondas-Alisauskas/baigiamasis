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
    private static final String SELECT = "SELECT * FROM period WHERE id =?";
    private static final String SELECT_ALL = "SELECT * FROM period";
    private static final String DELETE = "DELETE FROM period WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";

    @Override
    public Period get(String id) {
        Period period = new Period();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                period.setId(rs.getString("id"));
                period.setWorkDays(rs.getInt("workDays"));
                period.setWorkHours(rs.getInt("workHours"));
                period.setMin(rs.getDouble("min"));
                period.setHourlyMin(rs.getDouble("hourlyMin"));
                period.setMoreTimeCoefficient(rs.getDouble("moreTimeCoefficient"));
                period.setRedDayCoefficient(rs.getDouble("redDayCoefficient"));
                period.setTaxFree(rs.getDouble("taxFree"));
                period.setCoefficient(rs.getDouble("coefficient"));
                period.setBase(rs.getDouble("base"));
                period.setPercent(rs.getDouble("percent"));
                period.setPnpd(rs.getDouble("pnpd"));
                period.setHealthEmployee(rs.getDouble("healthEmployee"));
                period.setHealthNewEmployee(rs.getDouble("healthNewEmployee"));
                period.setHealthEmployer(rs.getDouble("healthEmployer"));
                period.setSocialEmployee(rs.getDouble("socialEmployee"));
                period.setSocialEmployer(rs.getDouble("socialEmployer"));
                period.setGuaranteeFund(rs.getDouble("guaranteeFund"));
                period.setSickPayCoefficient(rs.getDouble("sickPayCoefficient"));
                period.setSickPayDay(rs.getInt("sickPayDay"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return period;
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
                Period period = new Period();
                period.setId(rs.getString("id"));
                period.setWorkHours(rs.getInt("workDays"));
                period.setWorkDays(rs.getInt("workHours"));
                period.setMin(rs.getDouble("min"));
                period.setHourlyMin(rs.getDouble("hourlyMin"));
                period.setMoreTimeCoefficient(rs.getDouble("moreTimeCoefficient"));
                period.setRedDayCoefficient(rs.getDouble("redDayCoefficient"));
                period.setTaxFree(rs.getInt("taxFree"));
                period.setCoefficient(rs.getInt("coefficient"));
                period.setBase(rs.getDouble("base"));
                period.setPercent(rs.getDouble("percent"));
                period.setPnpd(rs.getDouble("pnpd"));
                period.setHealthEmployee(rs.getDouble("healthEmployee"));
                period.setHealthNewEmployee(rs.getDouble("healthNewEmployee"));
                period.setHealthEmployer(rs.getDouble("healthEmployer"));
                period.setSocialEmployee(rs.getDouble("socialEmployee"));
                period.setSocialEmployer(rs.getDouble("socialEmployer"));
                period.setGuaranteeFund(rs.getDouble("guaranteeFund"));
                period.setSickPayCoefficient(rs.getDouble("sickPayCoefficient"));
                period.setSickPayDay(rs.getInt("sickPayDay"));
                result.add(period);
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
}
