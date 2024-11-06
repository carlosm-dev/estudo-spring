package br.com.estudo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.estudo.spring.notificacao.Notificador;
import br.com.estudo.spring.service.NotificadorService;

@Configuration
public class NotificadorServiceConfig {
	
	public NotificadorServiceConfig() {
		System.out.println("Chamou NotificadorServiceConfig");
	}
	
	@Bean
	public NotificadorService notificadorService(Notificador notificador) {
		return new NotificadorService(notificador);
	}

}
