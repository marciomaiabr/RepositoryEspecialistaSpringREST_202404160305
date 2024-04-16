package com.example.algafood.service;

import com.example.algafood.modelo.Cliente;

public class ClienteAtivadoEvent {

	private Cliente cliente;

	static {
		System.out.println("ClienteAtivadoEvent.static");
	}

	public ClienteAtivadoEvent(Cliente cliente) {
		System.out.println("ClienteAtivadoEvent.ClienteAtivadoEvent()");
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
