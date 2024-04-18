package com.springproject.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
