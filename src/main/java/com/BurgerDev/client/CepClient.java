package com.BurgerDev.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CepCLient", url = "https://viacep.com.br")
public interface CepClient {
	
	@GetMapping("/ws/{cep}/json")
	CEP getCepInfo(@PathVariable String cep);

}
