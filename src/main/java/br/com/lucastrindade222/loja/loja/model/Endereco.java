//package br.com.lucastrindade222.loja.loja.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//
//import br.com.lucastrindade222.loja.loja.enums.UF;
//
//@Embeddable
//public class Endereco implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	private String cep;
//
//	private String cidade;
//
//	private String bairro;
//
//	private String rua;
//
//	private String numero;
//
//	private String complemento;
//	
//	private int uf;
//	
//	private long city;
//  
//
//	public Endereco() {
//
//	}
//
//	public Endereco(String cep, String cidade, String bairro, String rua, String numero, String complemento, int uf,long city) {
//		super();
//		this.cep = cep;
//		this.cidade = cidade;
//		this.bairro = bairro;
//		this.rua = rua;
//		this.numero = numero;
//		this.complemento = complemento;
//		this.uf = uf;
//		this.city = city;
//	}
//
//	public String getCep() {
//		return cep;
//	}
//
//	public void setCep(String cep) {
//		this.cep = cep;
//	}
//
//	public String getCidade() {
//		return cidade;
//	}
//
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//
//	public String getBairro() {
//		return bairro;
//	}
//
//	public void setBairro(String bairro) {
//		this.bairro = bairro;
//	}
//
//	public String getRua() {
//		return rua;
//	}
//
//	public void setRua(String rua) {
//		this.rua = rua;
//	}
//
//	public String getNumero() {
//		return numero;
//	}
//
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}
//
//	public String getComplemento() {
//		return complemento;
//	}
//
//	public void setComplemento(String complemento) {
//		this.complemento = complemento;
//	}
//	public long getCity() {
//		return city;
//	}
//
//	public void setCity(long city) {
//		this.city = city;
//	}
//
//	public UF getUf() {
//		return UF.toEnum(uf);
//	}
//
//	public void setUf(UF uf) {
//		this.uf = uf.getCod();
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
// 
//
//}
