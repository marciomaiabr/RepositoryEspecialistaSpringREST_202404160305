package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.model.CozinhasXmlWrapper;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.service.CadastroCozinhaService;

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

	@Autowired
	private CadastroCozinhaService cadastroCozinhaService;

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

		if (cozinha != null)
			return ResponseEntity.ok(cozinha);
		else
			return ResponseEntity.notFound().build();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cozinha adicionar(@RequestBody Cozinha cozinha) {
		System.out.println("CozinhaController.adicionar()");
		return cadastroCozinhaService.salvar(cozinha);
	}

	@PutMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> atualizar(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinhaHtml) {
		Cozinha cozinhaAtual = cozinhaRepository.buscar(cozinhaId);

		if (cozinhaAtual != null) {
			BeanUtils.copyProperties(cozinhaHtml, cozinhaAtual, "id");

			Cozinha cozinhaAtualizada = cozinhaRepository.salvar(cozinhaAtual);

			return ResponseEntity.ok(cozinhaAtualizada);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> remover(@PathVariable Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);

		try {
			if (cozinha != null) {
				cozinhaRepository.remover(cozinha);

				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}

}
