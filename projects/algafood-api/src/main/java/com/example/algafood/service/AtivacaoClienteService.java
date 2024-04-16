package com.example.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.INotificador;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

	static {
		System.out.println("AtivacaoClienteService.static");
	}

	public AtivacaoClienteService() {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService()");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("AtivacaoClienteService.postConstruct()");
	}

	@Autowired
	@TipoDoQualificador(NivelUrgencia.URGENTE)
	private INotificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("AtivacaoClienteService.preDestroy()");
	}

}
