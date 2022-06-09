package br.com.lucastrindade222.loja.loja.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Funcionario {
	@Id
	private String code;
	private String nome;
	private Integer idade;
	private BigDecimal salario;
	private Funcionario chefe;

	public Funcionario() {
	}

	public Funcionario(String code, String nome, Integer idade, BigDecimal salario, Funcionario chefe) {

		super();
		this.code = code;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.chefe = chefe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Funcionario getChefe() {
		return chefe;
	}

	public void setChefe(Funcionario chefe) {
		this.chefe = chefe;
	}
	

}
