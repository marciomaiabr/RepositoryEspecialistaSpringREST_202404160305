package com.algaworks.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	static {
		System.out.println("CadastroCozinhaService.static");
	}

	public CadastroCozinhaService() {
		System.out.println("CadastroCozinhaService.CadastroCozinhaService()");
	}

	public Cozinha salvar(Cozinha cozinha) {
		System.out.println("CadastroCozinhaService.salvar()");
		return cozinhaRepository.salvar(cozinha);
	}

}
