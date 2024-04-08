package com.BurgerDev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BurgerDev.client.CEP;
import com.BurgerDev.client.CepClient;

@Service
public class CEPService {
	
	@Autowired
	private CepClient cepClient;
	
	private CEP cep;
	
	
	public CEP buscarCep(String cep) {
		this.cep = cepClient.getCepInfo(cep);
		return this.cep;
    }
	

}
