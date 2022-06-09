package br.com.lucastrindade222.loja.loja.enums;


public enum TipoDeTelefone {

	CELULAR(1, "CELULAR"), 
	FIXO(2, "RESIDENCIAL");

	private int codigo;
	private String descricao;

	private TipoDeTelefone(int codigo, String descricao) {
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
	
	
	public static TipoDeTelefone toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoDeTelefone o : TipoDeTelefone.values()) {
			if (codigo.equals(o.getCodigo())) {
				return o;
			}
		}

		throw new IllegalArgumentException("Tipo inválido: " + codigo);
	}

}
