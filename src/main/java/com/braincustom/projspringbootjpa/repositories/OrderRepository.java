package com.braincustom.projspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braincustom.projspringbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
