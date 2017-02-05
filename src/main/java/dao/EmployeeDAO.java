package dao;

import entity.Employee;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vserdiuk on 2/4/17.
 */
public interface EmployeeDAO {

    //create
    void add(Employee employee) throws SQLException;

    //read
    List<Employee> getAll() throws SQLException;

    Employee getById(Long id) throws SQLException;

    //update
    void update(Employee employee) throws SQLException;

    //delete
    void remove(Employee employee) throws SQLException;

}
