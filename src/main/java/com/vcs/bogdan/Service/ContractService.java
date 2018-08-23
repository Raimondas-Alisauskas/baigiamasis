package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Contract;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class ContractService implements DBService<Contract> {

    private static final String INSERT_INTO = "INSERT INTO contract Values(?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE contract SET personId =?, date =?, event =?, type =?, dayHours =?, wage =?, isMain =? WHERE id =";
    private static final String SELECT = "SELECT * FROM contract WHERE id =";
    private static final String SELECT_ALL = "SELECT * FROM contract";
    private static final String DELETE = "DELETE FROM contract WHERE id =";
    private static final String INSERT = "I";
    private static final String ID = "id";
    private static final String PERSON_ID = "personId";
    private static final String DATE = "date";
    private static final String EVENT = "event";
    private static final String TYPE = "type";
    private static final String DAY_HOURS = "dayHours";
    private static final String WAGE = "wage";
    private static final String MAIN = "isMain";

    @Override
    public Contract get(String id) {
        Contract contract = new Contract();
        try {
            preparedStatement = connection.prepareStatement(SELECT + id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                contract.setId(rs.getString(ID));
                contract.setPersonId(rs.getString(PERSON_ID));
                contract.setDate(rs.getLong(DATE));
                contract.setEvent(rs.getString(EVENT));
                contract.setType(rs.getString(TYPE));
                contract.setDayHours(rs.getDouble(DAY_HOURS));
                contract.setWage(rs.getDouble(WAGE));
                contract.setMain(rs.getBoolean(MAIN));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    @Override
    public void add(Contract contract) {
        String queryStatement = "";
        String id = contract.getPersonId();

        if (StringUtils.isNullOrEmpty(get(id).getId())) {
            queryStatement = INSERT_INTO;
        } else {
            queryStatement = UPDATE + id;
        }

        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(queryStatement);
            if (queryStatement.substring(0, 1).equals(INSERT)) {
                preparedStatement.setObject(index++, contract.getId());
            }
            preparedStatement.setObject(index++, contract.getPersonId());
            preparedStatement.setObject(index++, contract.getDate());
            preparedStatement.setObject(index++, contract.getEvent().toString());
            preparedStatement.setObject(index++, contract.getType().toString());
            preparedStatement.setObject(index++, contract.getDayHours());
            preparedStatement.setObject(index++, contract.getWage());
            preparedStatement.setObject(index, contract.isMain());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contract> getAll() {
        List<Contract> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Contract contract = new Contract();
                contract.setId(rs.getString(ID));
                contract.setPersonId(rs.getString(PERSON_ID));
                contract.setDate(rs.getLong(DATE));
                contract.setEvent(rs.getString(EVENT));
                contract.setType(rs.getString(TYPE));
                contract.setDayHours(rs.getInt(DAY_HOURS));
                contract.setWage(rs.getDouble(WAGE));
                contract.setMain(rs.getBoolean(MAIN));
                result.add(contract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void remove(String id) {

        try {
            preparedStatement = connection.prepareStatement(DELETE + id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // return Contract with minimum valid date
    public Contract getContractWithEarlyValidDate(String periodId, String personId) {

        Contract result = new Contract();

        List<Contract> contracts = new ContractService().getAll();
        Collections.sort(contracts, new ContractCoparator());
        for (Contract c : contracts) {
            if (c.getDate() / 100 <= Integer.valueOf(periodId) && c.getPersonId().equals(personId)) {
                result = c;
            }
        }
        return result;
    }
}