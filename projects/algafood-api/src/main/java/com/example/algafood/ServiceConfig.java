package com.example.algafood;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

	static {
		System.out.println("ServiceConfig.static");
	}

	public ServiceConfig() {
		System.out.println("ServiceConfig.ServiceConfig()");
	}

}
