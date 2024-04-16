package com.example.algafood.notificacao;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.service.INotificador;

public class NotificadorEmail implements INotificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		System.out.println("NotificadorEmail.NotificadorEmail()");
		this.hostServidorSmtp = hostServidorSmtp;
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (caixaAlta)
			mensagem = mensagem.toUpperCase();
		System.out.printf("Notificando %s através do e-mail %s usando o SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
