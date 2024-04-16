package com.example.algafood.service;

import com.example.algafood.modelo.Cliente;

public class AtivacaoClienteService {

	private INotificador notificador;

	/*
	 * public AtivacaoClienteService() {
	 * System.out.println("AtivacaoClienteService.AtivacaoClienteService()"); }
	 */

	public AtivacaoClienteService(INotificador notificador) {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService(" + notificador + ")[" + notificador + "]");
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

}
