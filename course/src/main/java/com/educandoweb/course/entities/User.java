package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	//Passo 5: Serializable
		//implementar o Serializable, importar a classe e implementar o número de série.
	private static final long serialVersionUID = 1L;
	
	
	//Passo 1: Criar os atributos com visibilidade private
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	//Passo 2: Criar os construtores default e com todos os atributos
	public User() {}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	//Passo 3: Encapsulamento dos atributos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Passo 4: Criar hashcode equals
	/*
	 *equals(Object obj)
Serve para comparar se dois objetos são "iguais".

Por padrão, o equals da classe Object compara endereços de memória (ou seja, só retorna true se for exatamente o mesmo objeto).

Quando sobrescrevemos equals, definimos o que significa igualdade de conteúdo para nossos objetos.
Exemplo típico em uma entidade: dois usuários são iguais se o ID deles for igual.
	 * 
	 * 
	 * hashCode()
Gera um número inteiro (hash) para o objeto.

Esse número é usado em estruturas que dependem de hashing, como:

HashSet

HashMap

HashTable

Regra de ouro:
Se dois objetos são iguais (equals retorna true), eles devem ter o mesmo hashCode.
(Se não for assim, você terá bugs muito difíceis de rastrear em coleções como Set ou Map.)
	 * 
	 * */
	 
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
