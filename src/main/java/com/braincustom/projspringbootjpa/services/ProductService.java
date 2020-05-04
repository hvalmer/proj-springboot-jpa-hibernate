package com.braincustom.projspringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braincustom.projspringbootjpa.entities.Product;
import com.braincustom.projspringbootjpa.repositories.ProductRepository;

//anotations
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//método para retornar todos os usuarios do BD
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
