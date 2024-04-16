package com.example.algafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.INotificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<INotificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		for(INotificador notificador : notificadores)
			notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

}
