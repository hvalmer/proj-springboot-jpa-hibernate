package com.braincustom.projspringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braincustom.projspringbootjpa.entities.User;
import com.braincustom.projspringbootjpa.repositories.UserRepository;

//anotations
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//método para retornar todos os usuarios do BD
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}