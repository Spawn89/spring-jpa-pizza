package com.jdalbert.pizza.dao;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author jdalbert
 */
public interface Dao<T> {

    // Create
    public void create(T domain) throws DataAccessException;

    // Read
    public T findById(long id);
    public List<T> findAll() throws DataAccessException;

    // Update
    public void update(T domain) throws DataAccessException;

    // Delete
    public void delete(T domain) throws DataAccessException;
    public void delete(long id) throws DataAccessException;

}
