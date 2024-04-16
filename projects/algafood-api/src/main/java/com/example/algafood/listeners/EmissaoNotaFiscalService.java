package com.example.algafood.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.algafood.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

	static {
		System.out.println("EmissaoNotaFiscalService.static");
	}

	public EmissaoNotaFiscalService() {
		System.out.println("EmissaoNotaFiscalService.NotificacaoService()");
	}

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent clienteAtivadoEvent) {
		System.out.println("NotificacaoService.clienteAtivadoListener()");
		System.out.println("Emitindo nota fiscal para cliente " + clienteAtivadoEvent.getCliente().getNome() + " .");
	}

}
