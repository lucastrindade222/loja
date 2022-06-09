//package br.com.lucastrindade222.loja.loja.model;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
// 
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Document
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "TIPO", discriminatorType = DiscriminatorType.STRING)
//public abstract class Usuario implements Serializable, UserDetails {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@Column(unique = true)
//	@Email(message = "O campo email não pode estar vazio.")
//	@NotEmpty(message = "O campo email não pode estar vazio.")
//	private String email;
//	@NotEmpty(message = "O campo senha não pode estar vazio.")
//	@JsonIgnore
//	private String senha;
//	private String avataarUri;
//	private String nome_ft;
//	private Integer sala_Atual;
//	 
//	private List<Role> role;
//
//	 
//
//	public Usuario() {
//		super();
//	}
//
//	public Usuario(Integer id, String email, String senha, String avataarUri) {
//		super();
//		this.id = id;
//		this.email = email;
//		this.senha = senha;
//		this.avataarUri = avataarUri;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//
//	public List<Role> getRoles() {
//		return role;
//	}
//
//	public void setRoles(List<Role> role) {
//		this.role = role;
//	}
//
//	public String getAvataarUri() {
//		return avataarUri;
//	}
//
//	public void setAvataarUri(String avataarUri) {
//		this.avataarUri = avataarUri;
//	}
//
//	public String getNome_ft() {
//		return nome_ft;
//	}
//
//	public void setNome_ft(String nome_ft) {
//		this.nome_ft = nome_ft;
//	}
//
//	public List<Role> getRole() {
//		return role;
//	}
//
//	public void setRole(List<Role> role) {
//		this.role = role;
//	}
//
//	public Integer getSala_Atual() {
//		return sala_Atual;
//	}
//
//	public void setSala_Atual(Integer sala_Atual) {
//		this.sala_Atual = sala_Atual;
//	}
//
//	@JsonIgnore
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return this.role;
//	}
//
//	@JsonIgnore
//	@Override
//	public String getPassword() {
//		return this.senha;
//	}
//
//	@JsonIgnore
//	@Override
//	public String getUsername() {
//		return this.email;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@JsonIgnore
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		Usuario that = (Usuario) o;
//		return Objects.equals(id, that.id);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	public boolean userHasAuthority(String authority) {
//		Collection<? extends GrantedAuthority> authorities = getAuthorities();
//		for (GrantedAuthority grantedAuthority : authorities) {
//			if (authority.equals(grantedAuthority.getAuthority())) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//}
