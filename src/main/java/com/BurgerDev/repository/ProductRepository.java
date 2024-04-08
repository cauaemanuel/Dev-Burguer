package com.BurgerDev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BurgerDev.model.Produto;

@Repository
public interface ProductRepository extends JpaRepository<Produto, Integer> {

	
	Produto findByNome(String Nome);
}
