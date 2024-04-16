package com.example.algafood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

@Component
@TipoDoQualificador(NivelUrgencia.NORMAL)
public class NotificadorEmail implements INotificador {

	@Autowired
	private NotificadorEmailProperties emailProperties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("NotificadorEmail.notificar()");
		System.out.println("	" + "[emailProperties.getHostServidor()=" + emailProperties.getHostServidor() + "]");
		System.out.println("	" + "[emailProperties.getPortaServidor()=" + emailProperties.getPortaServidor() + "]");
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
