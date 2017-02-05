package dao;

import entity.Address;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vserdiuk on 2/4/17.
 */
public interface AddressDAO {

    //create
    void add(Address address) throws SQLException;

    //read
    List<Address> getAll() throws SQLException;

    Address getById(Long id) throws SQLException;

    //update
    void update(Address address) throws SQLException;

    //delete
    void remove(Address address) throws SQLException;

}
