package br.com.lucastrindade222.loja.loja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lucastrindade222.loja.loja.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String>    {

}
