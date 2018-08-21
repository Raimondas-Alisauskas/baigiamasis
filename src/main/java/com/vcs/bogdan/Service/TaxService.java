package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Tax;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class TaxService implements DBService<Tax> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO tax Values(?,?,?,?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE tax SET taxFree =?, coefficient =?, base =?, percent =?, pnpd =? WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM tax WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM tax";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM tax WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";
    private static final String ID = "id";
    private static final String TAX_FREE = "taxFree";
    private static final String COEFFICIENT = "coefficient";
    private static final String BASE = "base";
    private static final String PERCENT = "percent";
    private static final String PNPD = "pnpd";

    @Override
    public Tax get(List<Object> id) {
        return null;
    }

    @Override
    public Tax get(String id) {
        Tax tax = new Tax();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tax.setId(rs.getString(ID));
                tax.setTaxFree(rs.getDouble(TAX_FREE));
                tax.setCoefficient(rs.getDouble(COEFFICIENT));
                tax.setBase(rs.getDouble(BASE));
                tax.setPercent(rs.getDouble(PERCENT));
                tax.setPnpd(rs.getDouble(PNPD));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tax;
    }

    @Override
    public void add(Tax tax) {
        String id = tax.getId();
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
                preparedStatement.setObject(index++, tax.getId());
            }
            preparedStatement.setObject(index++, tax.getTaxFree());
            preparedStatement.setObject(index++, tax.getCoefficient());
            preparedStatement.setObject(index++, tax.getBase());
            preparedStatement.setObject(index++, tax.getPercent());
            preparedStatement.setObject(index, tax.getPercent());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Tax> getAll() {
        List<Tax> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Tax tax = new Tax();
                tax.setId(rs.getString(ID));
                tax.setTaxFree(rs.getInt(TAX_FREE));
                tax.setCoefficient(rs.getInt(COEFFICIENT));
                tax.setBase(rs.getDouble(BASE));
                tax.setPercent(rs.getDouble(PERCENT));
                tax.setPnpd(rs.getDouble(PNPD));
                result.add(tax);
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
