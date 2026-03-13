package com.igniscore.api.service;

import com.igniscore.api.model.Product;
import com.igniscore.api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(String name, String type, Date validity, String lot, Float price){
        Product product = new Product();
        product.setName(name);
        product.setType(type);
        product.setValidity(validity);
        product.setLot(lot);
        product.setPrice(price);


        return repository.save(product);

    }
}
