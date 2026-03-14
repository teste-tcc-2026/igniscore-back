package com.igniscore.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @SuppressWarnings("unused")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_product")
    private Integer id;

    @Column(name = "name_prod")
    private String name;

    @Column(name = "type_prod")
    private String type;

    @Column(name = "validity_prod")
    private LocalDate validity;

    @Column(name = "lot_prod")
    private String lot;

    @Column(name = "price_prod")
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_company")
    private Company company;


    public Integer getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public Float getPrice() {
        return price;
    }

    public String getLot() {
        return lot;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
