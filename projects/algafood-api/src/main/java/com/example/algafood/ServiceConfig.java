package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.notificacao.NotificadorEmail;
import com.example.algafood.service.AtivacaoClienteService;
import com.example.algafood.service.INotificador;

@Configuration
public class ServiceConfig {

	static {
		System.out.println("ServiceConfig.static");
	}

	public ServiceConfig() {
		System.out.println("ServiceConfig.ServiceConfig()");
	}

	@Bean
	public AtivacaoClienteService criaAtivacaoClienteService(INotificador notificador) {
		System.out.println("ServiceConfig.criaAtivacaoClienteService()");
		System.out.println("	"+"[notificador=" + notificador + "]");
		return new AtivacaoClienteService(notificador);
	}

}
