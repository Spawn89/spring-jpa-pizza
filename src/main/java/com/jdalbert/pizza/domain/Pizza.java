package com.jdalbert.pizza.domain;


import javax.persistence.*;

/**
 * @author jdalbert
 */
@Entity
public class Pizza {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Double price;

    public Pizza() {
    }

    public Pizza(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Pizza(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
