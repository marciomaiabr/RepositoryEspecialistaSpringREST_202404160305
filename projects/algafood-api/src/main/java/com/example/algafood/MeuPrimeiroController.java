package com.example.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.algafood.modelo.Cliente;
import com.example.algafood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	static {
		System.out.println("MeuPrimeiroController.static");
	}

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		System.out.println("MeuPrimeiroController.MeuPrimeiroController()");
		System.out.println("	" + "[this.ativacaoClienteService=" + this.ativacaoClienteService + "][" + ativacaoClienteService + "]");
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("MeuPrimeiroController.hello()");
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		ativacaoClienteService.ativar(joao);
		return "Olá...";
	}

}
