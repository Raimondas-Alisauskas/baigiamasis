package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.PayRoll;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class PayRollService implements DBService<PayRoll> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO payRoll Values(?,?,?,?,?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE payRoll SET periodId =?, nameSurname =?, income =?, tax =?, insurance =?, out =? WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM payRoll WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM payRoll";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM payRoll WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";

    @Override
    public PayRoll get(String id) {
        PayRoll result = new PayRoll();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) result = setPayRoll(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void add(PayRoll payRoll) {
        String id = getId(payRoll);
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
                preparedStatement.setObject(index++, payRoll.getId());
            }
            preparedStatement.setObject(index++, payRoll.getPeriodId());
            preparedStatement.setObject(index++, payRoll.getNameSurname());
            preparedStatement.setObject(index++, payRoll.getIncome());
            preparedStatement.setObject(index++, payRoll.getTax());
            preparedStatement.setObject(index++, payRoll.getInsurance());
            preparedStatement.setObject(index, payRoll.getOut());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PayRoll> getAll() {
        List<PayRoll> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) result.add(setPayRoll(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
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

    private PayRoll setPayRoll(ResultSet rs) throws SQLException {
        PayRoll result = new PayRoll();
        result.setId(rs.getString("id"));
        result.setPeriodId(rs.getString("periodID"));
        result.setNameSurname(rs.getString("nameSurname"));
        result.setIncome(rs.getDouble("income"));
        result.setTax(rs.getDouble("tax"));
        result.setInsurance(rs.getDouble("insurance"));
        result.setOut(rs.getDouble("out"));
        return result;
    }

    private String getId(PayRoll payRoll) {

        if (StringUtils.isNullOrEmpty(payRoll.getId())) {
            for (PayRoll p : getAll()) {
                if (p.getPeriodId().equals(payRoll.getPeriodId()) && p.getNameSurname().equals(payRoll.getNameSurname())) {
                    return p.getId();
                }
            }
        } else {
            return payRoll.getId();
        }
        return null;
    }
}

