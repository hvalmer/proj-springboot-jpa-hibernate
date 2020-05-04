package com.braincustom.projspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braincustom.projspringbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
