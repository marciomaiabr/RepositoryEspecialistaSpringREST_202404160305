package com.example.algafood.service;

import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificadorEmail;

	/*public AtivacaoClienteService() {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService()");
	}*/

	public AtivacaoClienteService(NotificadorEmail notificadorEmail) {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService(NotificadorEmail)[" + notificadorEmail + "]");
		this.notificadorEmail = notificadorEmail;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificadorEmail.notificar(cliente, "Seu cadastro está ativo !");
	}

}
