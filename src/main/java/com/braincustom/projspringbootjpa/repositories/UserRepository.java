package com.braincustom.projspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braincustom.projspringbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
