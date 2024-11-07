package br.com.estudo.spring.notificacao;

import org.springframework.stereotype.Component;

import br.com.estudo.spring.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("O cliente %s foi notificado por sms. %s\n", cliente.getNome(), mensagem);

	}


}
