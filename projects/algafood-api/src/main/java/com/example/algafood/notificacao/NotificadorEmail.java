package com.example.algafood.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

@Component
@TipoDoQualificador(NivelUrgencia.NORMAL)
public class NotificadorEmail implements INotificador {

	@Value("${mm.notificador.email.host-servidor}")
	private String host;

	//se não especificar ocorre: IllegalArgumentException: Could not resolve placeholder 'mm.notificador.email.porta-servidor' in value "${mm.notificador.email.porta-servidor}"
	//@Value("${mm.notificador.email.porta-servidor}")
	private Integer porta;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("NotificadorEmail.notificar()");
		System.out.println("[host=" + host + "][porta=" + porta + "]");
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
