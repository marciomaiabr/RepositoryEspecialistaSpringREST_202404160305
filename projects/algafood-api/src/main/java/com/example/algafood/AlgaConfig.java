package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.notificacao.NotificadorEmail;

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

}
