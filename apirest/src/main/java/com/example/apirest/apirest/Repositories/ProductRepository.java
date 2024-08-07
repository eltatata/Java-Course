package com.example.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
