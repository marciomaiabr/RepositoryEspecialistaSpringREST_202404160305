package com.example.algafood.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

@Component
@TipoDoQualificador(NivelUrgencia.URGENTE)
@Profile("VIP")
public class NotificadorSMSClienteVip implements INotificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("VIP: Notificando %s através do SMS %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
