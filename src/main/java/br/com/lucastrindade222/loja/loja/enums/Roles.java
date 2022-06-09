package br.com.lucastrindade222.loja.loja.enums;


public enum Roles {

	ADMINISTRADOR(1, "ADMINISTRADOR"), 
	CLIENTE(2, "CLIENTE"), 
	PROFISSIONAL(3, "PROFISSIONAL"),
	FUNCIONARIO(4, "FUNCIONARIO");

	private int codigo;
	private String descricao;

	private Roles(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static Roles toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (Roles o : Roles.values()) {
			if (codigo.equals(o.getCodigo())) {
				return o;
			}
		}

		throw new IllegalArgumentException("Tipo inválido: " + codigo);
	}

}
