package com.braincustom.projspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braincustom.projspringbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
