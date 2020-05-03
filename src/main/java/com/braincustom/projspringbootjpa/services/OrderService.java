package com.braincustom.projspringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braincustom.projspringbootjpa.entities.Order;
import com.braincustom.projspringbootjpa.repositories.OrderRepository;

//anotations
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	// método para retornar todos os usuarios do BD
	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
