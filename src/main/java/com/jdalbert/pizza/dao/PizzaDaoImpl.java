package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author jdalbert
 */
@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(Pizza pizza) throws DataAccessException {
        em.persist(pizza);
    }

    @Override
    public List<Pizza> findAll() throws DataAccessException {
        return null;    // TODO
    }

    @Override
    public Pizza findByName(String name) throws DataAccessException {
        TypedQuery<Pizza> q = em.createQuery("from Pizza p where p.name = :name", Pizza.class);
        q.setParameter("name", name);

        List<Pizza> pizzas = q.getResultList();

        return pizzas.isEmpty() ? null : pizzas.get(0);
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
