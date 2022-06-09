package br.com.lucastrindade222.loja.loja.service;

import java.util.List;

import br.com.lucastrindade222.loja.loja.model.Funcionario;

public interface FuncionarioService {

	public Funcionario salve(Funcionario funcionario);
	public List<Funcionario> all();
}
