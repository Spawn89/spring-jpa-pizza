package com.jdalbert.pizza.dao.impl;

import com.jdalbert.pizza.dao.PizzaDao;
import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author jdalbert
 */
@Repository
public class PizzaDaoImpl extends AbstractJpaDao<Pizza> implements PizzaDao {

    public PizzaDaoImpl() {
        this.setClazz(Pizza.class);
    }

    @Override
    public Pizza findByName(String name) throws DataAccessException {
        TypedQuery<Pizza> q = this.em.createQuery("from Pizza where name = :name", Pizza.class);
        q.setParameter("name", name);

        List<Pizza> pizzas = q.getResultList();

        return pizzas.isEmpty() ? null : pizzas.get(0);
    }

}
