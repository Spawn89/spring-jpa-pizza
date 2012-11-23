package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Customer;
import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author jdalbert
 */
public interface CustomerDao extends Dao<Customer> {

    public List<Customer> findAllByLastName(String lastName) throws DataAccessException;

}
