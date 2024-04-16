package com.example.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.service.INotificador;

@Component
public class NotificadorEmail implements INotificador {

	public NotificadorEmail() {
		System.out.println("NotificadorEmail.NotificadorEmail()");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
