package br.com.estudo.spring.service;

import br.com.estudo.spring.modelo.Cliente;

public class ClienteAtivadoEvent {

	private Cliente cliente;
	
	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	

}
