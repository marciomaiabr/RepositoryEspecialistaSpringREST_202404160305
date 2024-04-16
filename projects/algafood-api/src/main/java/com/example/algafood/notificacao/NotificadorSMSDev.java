package com.example.algafood.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

@Component
@TipoDoQualificador(NivelUrgencia.URGENTE)
@Profile("Dev")
public class NotificadorSMSDev implements INotificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Dev: Notificando %s através do SMS %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
