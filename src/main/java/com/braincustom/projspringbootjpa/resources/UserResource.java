package com.braincustom.projspringbootjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.braincustom.projspringbootjpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Harlan Valmer", "hvalmer@gmail.com", "984082876", "vtgd");
		return ResponseEntity.ok().body(u);
	}
}
