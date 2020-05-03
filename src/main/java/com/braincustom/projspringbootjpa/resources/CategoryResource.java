package com.braincustom.projspringbootjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.braincustom.projspringbootjpa.entities.Category;
import com.braincustom.projspringbootjpa.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	//dependencia para o service
	@Autowired //o spring faz a injeção de dependencia
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
