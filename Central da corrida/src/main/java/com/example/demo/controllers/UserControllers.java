package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("users")
public class UserControllers {
	
@Autowired

private UserRepository repository;

@GetMapping 
public List<User> findAll(){
	List<User> result = repository.findAll();
	return result;
}

@PostMapping
public User criarUser (@RequestBody User usuario){
	User usuarioNovo = repository.save(usuario);
	return usuarioNovo;
}
@PutMapping
public User editarUser (@RequestBody User usuario){
	User usuarioNovo = repository.save(usuario);
	return usuarioNovo;
}

@DeleteMapping("/{id}")
public Optional<User> excluirUsuario (@PathVariable Long id) {
	Optional<User>  Usuario= repository.findById(id);
	repository.deleteById(id);
	return Usuario;
}
	

}
