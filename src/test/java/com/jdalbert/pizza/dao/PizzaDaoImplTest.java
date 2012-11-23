package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.domain.Pizza;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author jdalbert
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-app-context-mysql.xml")
public class PizzaDaoImplTest {

    private @Autowired DataSource dataSource;
    private @Autowired PizzaDao pizzaDao;

    @Test
    public void testFindByName() throws Exception {
        // Given
        Pizza pins = new Pizza("Pizza del Jefe", 10.0, "Delicioso !");
        this.pizzaDao.create(pins);

        // When
        Pizza p = this.pizzaDao.findByName("Pizza del Jefe");

        // Then
        assertThat(p.getName()).isEqualTo("Pizza del Jefe");
        assertThat(p.getPrice()).isEqualTo(10.0);
        assertThat(p.getDescription()).isEqualTo("Delicioso !");
    }

}
