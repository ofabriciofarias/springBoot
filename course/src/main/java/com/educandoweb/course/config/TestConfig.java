package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//Para dizer que é de configuração
@Configuration
//Para dizer que é específica de teste
//O nome de test tem que ser o mesmo colocado em application.properties
//para identificar e só rodar no perfil de teste.
@Profile("test")
public class TestConfig implements CommandLineRunner{
	//Será usada para popular o banco de dados
	//Para isso será feito a injeção de dependencia da UserRepository
	@Autowired //Só o Autowired já resolve a dependência
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	

}
