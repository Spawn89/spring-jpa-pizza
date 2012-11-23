package com.jdalbert.pizza.domain;

import javax.persistence.*;

/**
 * @author jdalbert
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String address;


    public Long getId() {
        return id;
    }

}
