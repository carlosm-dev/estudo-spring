package br.com.estudo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.estudo.spring.notificacao.NotificadorEMail;

@Configuration
public class NotificadorConfig {
	
	
	@Bean
	@Primary
	public NotificadorEMail notificadorEmail() {
		NotificadorEMail notificador = new NotificadorEMail("smt.notificador.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}

}
