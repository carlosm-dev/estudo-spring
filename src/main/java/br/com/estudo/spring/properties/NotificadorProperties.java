package br.com.estudo.spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador")
public class NotificadorProperties {
	
	private String emailHost;
	private String emailPort;
	
	
	public String getEmailHost() {
		return emailHost;
	}
	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}
	public String getEmailPort() {
		return emailPort;
	}
	public void setEmailPort(String emailPort) {
		this.emailPort = emailPort;
	}
	
	

}
