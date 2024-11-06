package br.com.estudo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.estudo.spring.modelo.Cliente;
import br.com.estudo.spring.service.NotificadorService;

@Controller
@RequestMapping("/notificar")
public class NotificacaoController {
	
	private NotificadorService notificadorService;
	
	@Autowired
	public NotificacaoController(NotificadorService notificadorService) {
		this.notificadorService = notificadorService;
	}
	
	@GetMapping()
	@ResponseBody
	public String notificar() {
		Cliente maria = new Cliente("Maria", "123456");
		notificadorService.notificar(maria);
		
		return "notificou";
	}

}
