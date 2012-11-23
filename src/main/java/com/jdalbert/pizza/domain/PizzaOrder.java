package com.jdalbert.pizza.domain;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * @author jdalbert
 */
@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Customer customer;

    @Column(nullable = false)
    private Date date;

    @ManyToMany
    private Collection<Pizza> pizzas;

}
