package com.jdalbert.pizza.dao.impl;

import com.jdalbert.pizza.dao.PizzaDao;
import com.jdalbert.pizza.dao.PizzaOrderDao;
import com.jdalbert.pizza.domain.Customer;
import com.jdalbert.pizza.domain.Pizza;
import com.jdalbert.pizza.domain.PizzaOrder;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author jdalbert
 */
@Repository
public class PizzaOrderDaoImpl extends AbstractJpaDao<PizzaOrder> implements PizzaOrderDao {

    public PizzaOrderDaoImpl() {
        this.setClazz(PizzaOrder.class);
    }

}
