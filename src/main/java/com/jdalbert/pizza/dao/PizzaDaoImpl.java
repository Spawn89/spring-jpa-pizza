package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author jdalbert
 */
public class PizzaDaoImpl implements PizzaDao {

    @Override
    public void create(Pizza pizza) throws DataAccessException {
        // TODO
    }

    @Override
    public List<Pizza> findAll() throws DataAccessException {
        return null;    // TODO
    }

    @Override
    public Pizza findById(Long id) throws DataAccessException {
        return null;    // TODO
    }

    @Override
    public Pizza findByName(String pizzaName) throws DataAccessException {
        return null;    // TODO
    }

    @Override
    public void update(Pizza pizza) throws DataAccessException {
        // TODO
    }

    @Override
    public void delete(Pizza pizza) throws DataAccessException {
        // TODO
    }
}
