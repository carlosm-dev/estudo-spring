package br.com.estudo.spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.estudo.spring.service.ClienteAtivadoEvent;

@Component
public class NotificacaoListener {
	
	@EventListener
	public void ativarClienteListener(ClienteAtivadoEvent event) {
		System.out.println("Respondendo ao evento " + event.getCliente().getNome());
	}

}
