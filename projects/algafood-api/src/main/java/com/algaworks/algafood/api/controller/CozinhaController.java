package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

	static {
		System.out.println("CozinhaController.static");
	}

	public CozinhaController() {
		System.out.println("CozinhaController.CozinhaController()");
	}

	@Autowired
	private CozinhaRepository cozinhaRepository;

	@GetMapping
	public List<Cozinha> listar() {
		System.out.println("CozinhaController.listar()");
		return cozinhaRepository.listar();
	}

	@GetMapping("/{cozinhaId}")
	public Cozinha buscar(@PathVariable("cozinhaId") Long id) {
		System.out.println("CozinhaController.buscar(Long)[" + id + "]");
		return cozinhaRepository.buscar(id);
	}

}
