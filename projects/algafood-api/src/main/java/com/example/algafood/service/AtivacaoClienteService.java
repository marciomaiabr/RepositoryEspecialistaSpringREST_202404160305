package com.example.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.INotificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private INotificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		if(notificador != null)
			notificador.notificar(cliente, "Seu cadastro está ativo !");
		else
			System.out.println("Não existe notificador, mas cliente foi ativado !");
	}

}
