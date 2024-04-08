package com.BurgerDev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BurgerDev.client.CEP;
import com.BurgerDev.service.BurguerService;
import com.BurgerDev.service.CEPService;
import com.BurgerDev.model.*;

@RestController
@RequestMapping("/home")
public class BurguerController {

	@Autowired
	private BurguerService burguerservice;
	
	@Autowired
	private CEPService cepservice;
	
	//Todos os Metodos GET
	
	//Chamar quando for confirmar pedido
	@GetMapping("/{cep}")
	public CEP obterCep(@PathVariable String cep) {
		return cepservice.buscarCep(cep);
	}
	
	//Chamar ao iniciar pag
	@GetMapping
	public List<Produto> obterTodosProd(){
		return burguerservice.buscasTodosOsProdutosBanco();
	}
		
}
