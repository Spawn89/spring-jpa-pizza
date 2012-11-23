package com.jdalbert.pizza.dao;

import com.jdalbert.pizza.CommonOperations;
import com.jdalbert.pizza.domain.Pizza;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.DbSetupTracker;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.Operation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.List;

import static com.ninja_squad.dbsetup.Operations.insertInto;
import static com.ninja_squad.dbsetup.Operations.sequenceOf;
import static org.fest.assertions.Assertions.assertThat;

/**
 * @author jdalbert
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-app-context-hsql.xml")
public class PizzaDaoImplTest {

    private @Autowired DataSource dataSource;
    private @Autowired PizzaDao pizzaDao;

    private static DbSetupTracker dbSetupTracker = new DbSetupTracker();

    @Before
    public void prepare() throws Exception {
        Operation operation =
                sequenceOf(
                        CommonOperations.DELETE_ALL,
                        insertInto("pizza")
                                .columns("id", "name", "description", "price")
                                .values(1L, "Pizza Ultima", "Ma que buena !!!", 13)
                                .values(2L, "Pizza del Jefe", "Delicioso !", 12)
                                .values(3L, "Pizza pomme de terre", null, 12)
                                .values(4L, "Pizza Regina", null, 10)
                                .build());

        DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);

//        dbSetup.launch();
        this.dbSetupTracker.launchIfNecessary(dbSetup);
    }

    @Test
    public void testFindByName() throws Exception {
        // Given
        this.dbSetupTracker.skipNextLaunch();

        // When
        Pizza pizza = this.pizzaDao.findByName("Pizza pomme de terre");

        // Then
        assertThat(pizza.getPrice()).isEqualTo(12);
    }

    @Test
    public void testDelete() throws Exception {
        // Given

        // When
        this.pizzaDao.delete(1L);

        // Then
        assertThat(this.pizzaDao.findById(1L)).isNull();
    }

    @Test
    public void testFindAll() {
        // Given
        this.dbSetupTracker.skipNextLaunch();

        // When
        List<Pizza> pizzas = this.pizzaDao.findAll();

        // Then
        assertThat(pizzas).hasSize(4);
    }

}
