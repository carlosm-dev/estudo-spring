package br.com.estudo.spring.notificacao;

import br.com.estudo.spring.modelo.Cliente;


public class NotificadorEMail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEMail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("O cliente %s foi notificado por email usando SMTP %s. %s\n", cliente.getNome(),this.hostServidorSmtp, mensagem);

	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
