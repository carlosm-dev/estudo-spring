package br.com.estudo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import br.com.estudo.spring.modelo.Cliente;
import br.com.estudo.spring.notificacao.Notificador;


public class NotificadorService {
	

	private Notificador notificador;
	
	public NotificadorService(Notificador notificador) {
		super();
		this.notificador = notificador;
	}

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void notificar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Cliente Ativado Com Sucesso!");
		
		//dizer para container que o cliente está ativo neste momento com event (Observable)
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}
