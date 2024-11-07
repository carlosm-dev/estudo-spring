package br.com.estudo.spring.modelo;

public class Cliente {
	
	private String nome;
	private String telefone;
	private Boolean ativo = Boolean.FALSE;
	

	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public String getTelefone() {
		return telefone;
	}
	
	
	public void ativar() {
		this.ativo = Boolean.TRUE;
	}
	

}
