package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.notificacao.NotificadorEmail;
import com.example.algafood.service.AtivacaoClienteService;

@Configuration
public class NotificacaoConfig {

	static {
		System.out.println("NotificacaoConfig.static");
	}

	public NotificacaoConfig() {
		System.out.println("NotificacaoConfig.NotificacaoConfig()");
	}

	/*@Bean
	public NotificadorEmail criaNotificadorEmail() {
		System.out.println("NotificacaoConfig.criaNotificadorEmail()");
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail;
	}*/

}
