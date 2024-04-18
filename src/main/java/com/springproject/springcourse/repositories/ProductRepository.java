package com.springproject.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
