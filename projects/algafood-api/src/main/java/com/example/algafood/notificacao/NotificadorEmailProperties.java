package com.example.algafood.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mm.notificador.email")
public class NotificadorEmailProperties {

	/**
	 * Host do servidor de email
	 */
	private String hostServidor = "smtp.default.com.br";

	/**
	 * Porta do servidor de email
	 */
	private Integer portaServidor = 25;

	public String getHostServidor() {
		return hostServidor;
	}

	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}

	public Integer getPortaServidor() {
		return portaServidor;
	}

	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}

}
