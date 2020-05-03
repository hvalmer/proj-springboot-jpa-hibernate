package com.braincustom.projspringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braincustom.projspringbootjpa.entities.Category;
import com.braincustom.projspringbootjpa.repositories.CategoryRepository;

//anotations
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//método para retornar todos os usuarios do BD
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
