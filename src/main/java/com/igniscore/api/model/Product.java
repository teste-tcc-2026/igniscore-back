package com.igniscore.api.model;

import jakarta.persistence.*;

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
    private String validity;

    @Column(name = "lot_prod")
    private String lot;

    @Column(name = "price_prod")
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_company")
    private Company company;



}
