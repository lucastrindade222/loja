//package br.com.lucastrindade222.loja.loja.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Embeddable;
//import javax.validation.constraints.NotNull;
//
//import br.com.lucastrindade222.loja.loja.enums.TipoTelefone;
//
//@Embeddable
//public class Telefone implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	private String ddd;
//
//	private String numero;
//
//	@NotNull(message = "Escolha pelo menos uma das opções.")
//	private TipoTelefone tipoTelefone;
//
//	public Telefone() {
//
//	}
//
//	public Telefone(String ddd, String numero, TipoTelefone tipoTelefone) {
//		super();
//		this.ddd = ddd;
//		this.numero = numero;
//		this.tipoTelefone = tipoTelefone;
//
//	}
//
//	public String getDdd() {
//		return ddd;
//	}
//
//	public void setDdd(String ddd) {
//		this.ddd = ddd;
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
//	public TipoTelefone getTipoTelefone() {
//		return tipoTelefone;
//	}
//
//	public void setTipoTelefone(TipoTelefone tipoTelefone) {
//		this.tipoTelefone = tipoTelefone;
//	}
//
//	 
//
//	 
//}
