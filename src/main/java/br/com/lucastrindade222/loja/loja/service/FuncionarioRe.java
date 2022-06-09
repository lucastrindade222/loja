package br.com.lucastrindade222.loja.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.lucastrindade222.loja.loja.model.Funcionario;
import br.com.lucastrindade222.loja.loja.repository.FuncionarioRepository;

@Service
public class FuncionarioRe implements FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;

	@Override
	public Funcionario salve(Funcionario funcionario) {
		this.repo.save(funcionario);

		return null;
	}

	@Override
	public List<Funcionario> all() {

		return this.repo.findAll();
	}

}
