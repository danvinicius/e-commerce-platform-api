package com.danvinicius.ecommerce.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danvinicius.ecommerce.entities.order.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
    
}