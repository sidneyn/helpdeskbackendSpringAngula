package com.sidney.helpdesk.domain.enums;

public enum Status {

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRRADO");
		
	private Integer codigo;
	private String descricao;
	
	private Status(Integer codigo, String descricao) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Status s : Status.values()) {
			if (cod.equals(s.codigo)){
				return s;
			}
		}
		throw new IllegalArgumentException("Status inválido");
		
	}
	
}
