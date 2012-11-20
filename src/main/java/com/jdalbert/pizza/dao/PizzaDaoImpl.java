package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author jdalbert
 */
@Repository
public class PizzaDaoImpl implements PizzaDao {

    @PersistenceContext
    private EntityManager em;

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
        Query query = em.createQuery("from Pizza p where p.name='" + pizzaName + "'");
        return (Pizza) query.getSingleResult();
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
