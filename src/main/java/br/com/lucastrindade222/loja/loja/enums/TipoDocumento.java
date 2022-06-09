package br.com.lucastrindade222.loja.loja.enums;

public enum TipoDocumento {

	CPF("CPF"),

	CNPJ("CNPJ");

	private final String tipo;

	private TipoDocumento(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
