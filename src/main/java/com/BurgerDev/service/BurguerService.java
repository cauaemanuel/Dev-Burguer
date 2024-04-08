package com.BurgerDev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BurgerDev.client.CEP;
import com.BurgerDev.model.Produto;
import com.BurgerDev.repository.ProductRepository;

@Service
public class BurguerService {
	
	@Autowired
	private ProductRepository repository; 

	public List<Produto> buscasTodosOsProdutosBanco(){
		return repository.findAll();
	}
	
}
