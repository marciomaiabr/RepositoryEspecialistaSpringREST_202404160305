package com.example.algafood.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.algafood.notificacao.INotificador;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;
import com.example.algafood.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	static {
		System.out.println("NotificacaoService.static");
	}

	public NotificacaoService() {
		System.out.println("NotificacaoService.NotificacaoService()");
	}

	@Autowired
	@TipoDoQualificador(NivelUrgencia.URGENTE)
	private INotificador notificador;

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent clienteAtivadoEvent) {
		System.out.println("NotificacaoService.clienteAtivadoListener()");
		notificador.notificar(clienteAtivadoEvent.getCliente(), "Seu cadastro está ativo !");
	}

}
