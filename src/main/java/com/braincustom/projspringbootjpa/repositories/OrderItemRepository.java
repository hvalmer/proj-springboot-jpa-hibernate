package com.braincustom.projspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braincustom.projspringbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
