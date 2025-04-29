package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//Adicionar uma anotação
@RestController
//Adicionar o request maping
@RequestMapping(value = "/users")
public class UserResource {

	//Para testar se está funcionando, irei criar um método para testar
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "m@gmail.com", "999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
