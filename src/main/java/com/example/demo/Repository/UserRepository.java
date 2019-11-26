package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository  //| implementar o repositorio usuando o spring date

public interface UserRepository extends MongoRepository<User, String>{ //| MongoRepository<T, ID> precisa de dois dados Tipo da
																	   //|   classe de dominio que ele vai gerenciar, e o tipo do ID 
																	   //| Assim podendo salvafr, atualizar e deletar 
}
