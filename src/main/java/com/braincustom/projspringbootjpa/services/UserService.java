package com.braincustom.projspringbootjpa.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.braincustom.projspringbootjpa.entities.User;
import com.braincustom.projspringbootjpa.repositories.UserRepository;
import com.braincustom.projspringbootjpa.services.exceptions.DatabaseException;
import com.braincustom.projspringbootjpa.services.exceptions.ResourceNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	//inserindo um novo usuário no BD
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//deletando um usuário no BD
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e){
			throw new ResourceNotFoundException(id);//minha exceção da camada de serviço
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());//minha exceção da camada de serviço
		}
	}
	
	//atualizando um usuário no BD
	public User update(Long id, User obj) {
		try {
			User entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
