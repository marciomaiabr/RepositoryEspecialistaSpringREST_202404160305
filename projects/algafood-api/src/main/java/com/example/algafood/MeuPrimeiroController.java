package com.example.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

	static {
		System.out.println("MeuPrimeiroController.static");
	}

	public MeuPrimeiroController() {
		System.out.println("MeuPrimeiroController.MeuPrimeiroController()");
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("MeuPrimeiroController.hello()");
		return "Hello...";
	}

}
