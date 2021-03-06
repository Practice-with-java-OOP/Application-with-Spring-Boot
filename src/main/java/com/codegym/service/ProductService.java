package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Optional<Product> findById(Integer id);

    void remove(Product product);
}
