package com.example.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	static {
		System.out.println("AtivacaoClienteService.static");
	}

	public AtivacaoClienteService() {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService()");
	}

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}
