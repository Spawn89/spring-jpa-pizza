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

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Collection<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Collection<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
