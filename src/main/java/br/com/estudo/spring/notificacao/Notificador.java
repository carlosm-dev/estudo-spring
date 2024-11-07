package br.com.estudo.spring.notificacao;

import br.com.estudo.spring.modelo.Cliente;

public interface Notificador {
	
	public void notificar(Cliente cliente, String mensagem);

}
