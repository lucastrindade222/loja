//package br.com.lucastrindade222.loja.loja.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.security.core.GrantedAuthority;
//
//@Document
//public class Role implements GrantedAuthority {
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	private String nomeRole;
//
//	@ManyToMany 
//	private List<Usuario> usuarios;
//
//	public String getNomeRole() {
//		return nomeRole;
//	}
//
//	public void setNomeRole(String nomeRole) {
//		this.nomeRole = nomeRole;
//	}
//
//	@Override
//	public String getAuthority() {
//		return this.nomeRole;
//	}
//
//}
