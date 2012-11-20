package com.jdalbert.pizza.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @author jdalbert
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-app-context-hsql.xml")
public class PizzaDaoImplTest {

    private @Autowired
    DataSource dataSource;

    @Test
    public void testFindByName() throws Exception {

    }

}
