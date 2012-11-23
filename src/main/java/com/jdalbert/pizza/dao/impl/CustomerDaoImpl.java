package com.jdalbert.pizza.dao.impl;

import com.jdalbert.pizza.dao.CustomerDao;
import com.jdalbert.pizza.domain.Customer;
import com.jdalbert.pizza.domain.Pizza;
import org.springframework.dao.DataAccessException;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author jdalbert
 */
public class CustomerDaoImpl extends AbstractJpaDao<Customer> implements CustomerDao {

    @Override
    protected void setClazz(Class<Customer> clazz) {
        super.setClazz(Customer.class);
    }

    @Override
    public List<Customer> findAllByLastName(String lastName) throws DataAccessException {
        TypedQuery<Customer> q = this.em.createQuery("from Customer where lastName = :lastName", Customer.class);
        q.setParameter("lastName", lastName);

        return q.getResultList();
    }

}
