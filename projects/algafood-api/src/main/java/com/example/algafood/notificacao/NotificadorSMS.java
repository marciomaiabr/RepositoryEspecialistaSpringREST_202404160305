package com.example.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;

@Component
public class NotificadorSMS implements INotificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do SMS %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
