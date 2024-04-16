package com.example.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.INotificador;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	@TipoDoQualificador(NivelUrgencia.URGENTE)
	private INotificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

}
