package br.com.estudo.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.estudo.spring.notificacao.NotificadorEMail;
import br.com.estudo.spring.properties.NotificadorProperties;

@Configuration
public class NotificadorConfig {
	
	@Value("${notificador.email-port}")
	private String port;
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
	@Bean
	@Primary
	public NotificadorEMail notificadorEmail() {
		NotificadorEMail notificador = new NotificadorEMail(notificadorProperties.getEmailHost() + port);
		notificador.setCaixaAlta(true);
		
		return notificador;
	}

}
