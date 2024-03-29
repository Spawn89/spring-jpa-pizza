package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author jdalbert
 */
public interface PizzaDao extends Dao<Pizza> {

    public Pizza findByName(String pizzaName) throws DataAccessException;

}
