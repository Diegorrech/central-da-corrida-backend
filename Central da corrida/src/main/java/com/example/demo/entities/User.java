package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private int    phone;
	private String modalidade;
	private String cidade;
	
	
	
	public User() {
		
	}


	public User(long id, String name, String email, int phone, String modalidade, String cidade, String bairro) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.modalidade = modalidade;
		this.cidade = cidade;

	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	

	
	
}
