package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.model.CozinhasXmlWrapper;
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

	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public CozinhasXmlWrapper listarXML() {
		System.out.println("CozinhaController.listarXML()");
		return new CozinhasXmlWrapper(cozinhaRepository.listar());
	}

	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
		System.out.println("CozinhaController.buscar(Long)[" + cozinhaId + "]");
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);

		if(cozinha != null)
			return ResponseEntity.ok(cozinha);
		else
			return ResponseEntity.notFound().build();

	}

}
