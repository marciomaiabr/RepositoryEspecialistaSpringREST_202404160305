package com.example.algafood.notificacao;

import com.example.algafood.modelo.Cliente;

public interface INotificador {

	void notificar(Cliente cliente, String mensagem);

}
