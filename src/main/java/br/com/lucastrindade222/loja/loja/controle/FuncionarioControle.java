package br.com.lucastrindade222.loja.loja.controle;
//
//import javax.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucastrindade222.loja.loja.model.Funcionario;
import br.com.lucastrindade222.loja.loja.service.FuncionarioRe;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControle {
	@Autowired
	private FuncionarioRe server;
     
	@PostMapping
	public Funcionario salve( @RequestBody Funcionario funcionario) {
		
		return this.server.salve(funcionario);
		
	}
	
	@GetMapping
	public List<Funcionario> novo( ) {
		
		return this.server.all();
		
	}
	
	
}
