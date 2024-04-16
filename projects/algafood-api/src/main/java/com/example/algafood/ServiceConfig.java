package com.example.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.algafood.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	static {
		System.out.println("ServiceConfig.static");
	}

	public ServiceConfig() {
		System.out.println("ServiceConfig.ServiceConfig()");
	}

	@Bean(initMethod = "init", destroyMethod = "finish")
	public AtivacaoClienteService criaAtivacaoClienteService() {
		System.out.println("ServiceConfig.criaAtivacaoClienteService()");
		return new AtivacaoClienteService();
	}

}
