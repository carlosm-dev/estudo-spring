package br.com.estudo.spring.service;

import br.com.estudo.spring.modelo.Cliente;
import br.com.estudo.spring.notificacao.Notificador;


public class NotificadorService {
	
	private Notificador notificador;
	
	public NotificadorService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("Chamou NotificadorService");
	}
	
	public void notificar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Cliente Ativado Com Sucesso!");
	}

}
