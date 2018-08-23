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
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE payRoll SET id =?, periodId =?, nameSurname =?, income =?, tax =?, insurance =?, out =? WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM payRoll WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM payRoll";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM payRoll WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";

    @Override
    public PayRoll get(String id) {
        PayRoll payRoll = new PayRoll();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                payRoll.setPeriodId(rs.getString("personID"));
                payRoll.setNameSurname(rs.getString("nameSurname"));
                payRoll.setIncome(rs.getDouble("income"));
                payRoll.setTax(rs.getDouble("tax"));
                payRoll.setInsurance(rs.getDouble("insurance"));
                payRoll.setOut(rs.getDouble("out"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payRoll;
    }

    @Override
    public void add(PayRoll payRoll) {
        String id = payRoll.getId();
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
                preparedStatement.setObject(index++, id);
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
            while (rs.next()) {
                PayRoll payRoll = new PayRoll();
                payRoll.setId(rs.getString("id"));
                payRoll.setPeriodId(rs.getString("periodID"));
                payRoll.setNameSurname(rs.getString("nameSurname"));
                payRoll.setIncome(rs.getDouble("income"));
                payRoll.setTax(rs.getDouble("tax"));
                payRoll.setInsurance(rs.getDouble("insurance"));
                payRoll.setOut(rs.getDouble("out"));
                result.add(payRoll);
            }
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

}

