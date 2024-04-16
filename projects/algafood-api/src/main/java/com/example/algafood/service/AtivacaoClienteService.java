package com.example.algafood.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.notificacao.INotificador;
import com.example.algafood.qualifiers.NivelUrgencia;
import com.example.algafood.qualifiers.TipoDoQualificador;

//@Component
public class AtivacaoClienteService implements InitializingBean , DisposableBean {

	static {
		System.out.println("AtivacaoClienteService.static");
	}

	public AtivacaoClienteService() {
		System.out.println("AtivacaoClienteService.AtivacaoClienteService()");
	}

	@Autowired
	@TipoDoQualificador(NivelUrgencia.URGENTE)
	private INotificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo !");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("implements InitializingBean - afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("implements DisposableBean - destroy()");
	}

}
