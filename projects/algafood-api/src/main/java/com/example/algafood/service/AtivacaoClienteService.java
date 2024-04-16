package com.example.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	private INotificador notificador;

	/*
	 * public AtivacaoClienteService() {
	 * System.out.println("AtivacaoClienteService.AtivacaoClienteService()"); }
	 */

	/*@Autowired
	public AtivacaoClienteService(INotificador notificador) {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService(INotificador)[" + notificador + "]");
		this.notificador = notificador;
	}*/

	/*public AtivacaoClienteService(String qqc) {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService(String)[" + qqc + "]");
	}*/

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

	@Autowired
	public void setNotificador(INotificador notificador) {
		System.out.println("AtivacaoClienteService.setNotificador()");
		System.out.println("[this.notificador=" + this.notificador + "][notificador=" + notificador + "]");
		this.notificador = notificador;
	}

}
