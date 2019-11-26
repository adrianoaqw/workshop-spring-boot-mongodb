package com.example.demo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.services.UserService;

@RestController   //| Para definir a class para ser um recurso Rest 

@RequestMapping(value="/users") //| Definir o caminho do EndPoint, padrao colocar o nome do recurso no plural 
public class UserResource {
	@Autowired
	private UserService service;
	@RequestMapping(method=RequestMethod.GET) //|para dizer que o EndPoint Rest vai ser no caminho value="/users" ou pode ser @GetMapping
	
	public ResponseEntity< List<User>> findAll(){ //| metodo para retornar uma lista de usuarios, findAll para buscar todos
		
		List<User> list = service.findAll();                          //| inplementação da class List  / ArrayList
		
		return ResponseEntity.ok().body(list);    //| retornando a lista, body pra definiro o corpo da resposta 
	}
}


/* CODIGO ANTIGO ADCIONDO DADOS MANUAIS 
 * public class UserResource {
	@Autowired
	private UserService service;
	@RequestMapping(method=RequestMethod.GET) //|para dizer que o EndPoint Rest vai ser no caminho value="/users" ou pode ser @GetMapping
	
	public ResponseEntity< List<User>> findAll(){ //| metodo para retornar uma lista de usuarios, findAll para buscar todos
		                                          //| ResponseEntity vai encapsular toda uma estrutura necessaria para retornar repostas http com possiveis cabeçalhos possiveis erros 
		User maria = new User("1", "Maria Brown", "maria@gmail.com");  //| instanciando os objetos usuario 
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();                          //| inplementação da class List  / ArrayList
		list.addAll(Arrays.asList(maria, alex));  //| adicionar objetos na lista 
		return ResponseEntity.ok().body(list);    //| retornando a lista, body pra definiro o corpo da resposta 
	}
 * */

