package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.domain.User;

@Service //| para que seja possivel que o Spring que a classe vai ser um servico que pode ser enjetavel em outras classes.
public class UserService {

	@Autowired //| instanciar altomaticamente o objeto.
	private UserRepository repo; //| quando e instanciano um objeto dentro de um classe usuaondo o  @Autowired o proprio 
	                             //|Spring vai proucurar a definição do objeto  e instancialo.
	public List<User> findAll(){ //|metodo Resposavel para retornar os usuario no banco de dados.
		return repo.findAll();//| retorna todoas os objetos User
	}
	
	
}
