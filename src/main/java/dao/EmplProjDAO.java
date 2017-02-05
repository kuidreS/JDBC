package dao;

import entity.EmplProj;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vserdiuk on 2/4/17.
 */
public interface EmplProjDAO {

    //create
    void add(EmplProj emplProj) throws SQLException;

    //read
    List<EmplProj> getAll() throws SQLException;

    EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId) throws SQLException;

    //update
    void update(EmplProj emplProj) throws SQLException;

    //delete
    void remove(EmplProj emplProj) throws SQLException;

}
