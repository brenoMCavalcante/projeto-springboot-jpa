package com.springproject.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springcourse.entities.OrderItem;
import com.springproject.springcourse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
