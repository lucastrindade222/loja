//package br.com.lucastrindade222.loja.loja.model;
//import java.util.Date;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.validation.constraints.NotEmpty;
//
//import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.br.CNPJ;
//import org.hibernate.validator.constraints.br.CPF;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import br.com.lucastrindade222.loja.loja.enums.TipoDocumento;
//
// 
//
//@Document
//public abstract class Pessoa extends Usuario {
//
//	private static final long serialVersionUID = 1L;
//
//	@NotEmpty(message = "O campo Nome não pode estar vazio.")
//	@Length(max = 60, min = 3, message = "O nome deve ter entre 3 e 60 caracteres")
//	private String nome;
//	@NotEmpty(message = "O campo Sobrenome não pode estar vazio.")
//	@Length(max = 60, min = 3, message = "O Sobrenome deve ter entre 3 e 60 caracteres")
//	private String sobreNome;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT-3")
//	private Date nascimento;
//
//	private TipoDocumento tipoDocumento;
//	@CPF
//	private String cpf;
//	@CNPJ
//	private String cnpj;
//	@Embedded
//	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero_telefone")) })
//	private Telefone telefone;
//	@Embedded
//	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero_endereco")) })
//	private Endereco endereco;
//
//	public Pessoa() {
//
//	}
//
//	public Pessoa(Integer id, String email, String senha, String nome, String sobreNome, Date nascimento,
//			TipoDocumento tipoDocumento, Telefone telefone, Endereco endereco, String avataarUri, String cpf, String cnpj) {
//		super(id, email, senha, avataarUri);
//		this.nome = nome;
//		this.sobreNome = sobreNome;
//		this.nascimento = nascimento;
//		this.tipoDocumento = tipoDocumento;
//		this.telefone = telefone;
//		this.endereco = endereco;
//		this.cpf = cpf;
//		this.cnpj = cnpj;
//	}
//
//	public Pessoa(Integer id, String email, String senha, String avataarUri, String nome, String sobreNome, TipoDocumento tipodocumento) {
//		super(id, email, senha, avataarUri);
//		this.nome = nome;
//		this.sobreNome = sobreNome;
//		this.tipoDocumento = tipodocumento;
//
//	}
//	
//	
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getSobreNome() {
//		return sobreNome;
//	}
//
//	public void setSobreNome(String sobreNome) {
//		this.sobreNome = sobreNome;
//	}
//
//	public Date getNascimento() {
//		return nascimento;
//	}
//
//	public void setNascimento(Date nascimento) {
//		this.nascimento = nascimento;
//	}
//
//	public TipoDocumento getTipoDocumento() {
//		return tipoDocumento;
//	}
//
//	public void setTipoDocumento(TipoDocumento tipoDocumento) {
//		this.tipoDocumento = tipoDocumento;
//	}
//
//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//
//	public Telefone getTelefone() {
//		return telefone;
//	}
//
//	public void setTelefone(Telefone telefone) {
//		this.telefone = telefone;
//	}
//
//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//
//	public String getCnpj() {
//		return cnpj;
//	}
//
//	public void setCnpj(String cnpj) {
//		this.cnpj = cnpj;
//	}
//
//
//}
