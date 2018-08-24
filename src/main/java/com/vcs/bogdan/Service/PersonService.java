package com.vcs.bogdan.Service;

import com.mysql.jdbc.StringUtils;
import com.vcs.bogdan.Beans.Contract;
import com.vcs.bogdan.Beans.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Service.DBConnection.connection;
import static com.vcs.bogdan.Service.DBConnection.preparedStatement;

public class PersonService implements DBService<Person> {

    private static final String INSERT_QUERY_STATEMENT = "INSERT INTO person Values(?,?,?)";
    private static final String UPDATE_QUERY_STATEMENT = "UPDATE person SET name =?, surname =? WHERE id =";
    private static final String SELECT_QUERY_STATEMENT = "SELECT * FROM person WHERE id =?";
    private static final String SELECT_ALL_QUERY_STATEMENT = "SELECT * FROM person";
    private static final String DELETE_QUERY_STATEMENT = "DELETE FROM person WHERE id ='";
    private static final String INSERT = "I";
    private static final String QUOTE = "'";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String SURNAME = "surname";

    @Override
    public Person get(String id) {
        Person result = new Person();
        try {
            int index = 1;
            preparedStatement = connection.prepareStatement(SELECT_QUERY_STATEMENT);
            preparedStatement.setString(index, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                result = setPerson(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void add(Person person) {
        String id = person.getId();
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
            preparedStatement.setObject(index++, person.getName());
            preparedStatement.setObject(index, person.getSurname());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> getAll() {
        List<Person> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY_STATEMENT);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) result.add(setPerson(rs));
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

    private Person setPerson(ResultSet rs) throws SQLException {
        Person result = new Person();
        result.setId(rs.getString(ID));
        result.setName(rs.getString(NAME));
        result.setSurname(rs.getString(SURNAME));
        return result;
    }

}
