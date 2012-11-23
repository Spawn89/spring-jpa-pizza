package com.jdalbert.pizza.dao.impl;

import com.jdalbert.pizza.dao.Dao;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author jdalbert
 */
@Transactional
public abstract class AbstractJpaDao<T> implements Dao<T> {

    private Class<T> clazz;

    @PersistenceContext
    protected EntityManager em;

    protected void setClazz(Class<T> clazz){
        this.clazz = clazz;
    }

    @Override
    public void create(T domain) throws DataAccessException {
        this.em.persist(domain);
    }

    @Override
    public T findById(long id) {
        return this.em.find(this.clazz, id);
    }

    @Override
    public List<T> findAll() throws DataAccessException {
        TypedQuery<T> q = this.em.createQuery("from " + clazz.getName(), clazz);

        return q.getResultList();
    }

    @Override
    public void update(T domain) throws DataAccessException {
        this.em.merge(domain);
    }

    @Override
    public void delete(T domain) throws DataAccessException {
        this.em.remove(domain);
    }

    @Override
    public void delete(long id) throws DataAccessException {
        T domain = this.findById(id);

        this.delete(domain);
    }
}
