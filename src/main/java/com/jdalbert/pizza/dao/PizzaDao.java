package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author jdalbert
 */
public interface PizzaDao {

    public void create(Pizza pizza) throws DataAccessException;

    public List<Pizza> findAll() throws DataAccessException;

    public Pizza findByName(String pizzaName) throws DataAccessException;

    public void update(Pizza pizza) throws DataAccessException;

    public void delete(Pizza pizza) throws DataAccessException;

}
