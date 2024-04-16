package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.notificacao.NotificadorEmail;
import com.example.algafood.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {

	static {
		System.out.println("AlgaConfig.static");
	}

	public AlgaConfig() {
		System.out.println("AlgaConfig.AlgaConfig()");
	}

	@Bean
	public NotificadorEmail criaNotificadorEmail() {
		System.out.println("AlgaConfig.criaNotificadorEmail()");
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail;
	}

	@Bean
	public AtivacaoClienteService criaAtivacaoClienteService() {
		System.out.println("AlgaConfig.criaAtivacaoClienteService()");
		return new AtivacaoClienteService(criaNotificadorEmail());
	}

}
