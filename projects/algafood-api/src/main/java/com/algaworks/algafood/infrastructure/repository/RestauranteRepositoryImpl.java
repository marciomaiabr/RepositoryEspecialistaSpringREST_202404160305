package com.algaworks.algafood.infrastructure.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Restaurante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class RestauranteRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Restaurante> find(String nome, BigDecimal taxaInicial, BigDecimal taxaFinal){
		var jpql = "from Restaurante where nome like :nome and taxaFrete between :taxaFreteInicial and :taxaFreteFinal ";
		return entityManager.createQuery(jpql, Restaurante.class)
				.setParameter("nome", "%"+nome+"%")
				.setParameter("taxaFreteInicial", taxaInicial)
				.setParameter("taxaFreteFinal", taxaFinal)
				.getResultList();
	}
	
}
