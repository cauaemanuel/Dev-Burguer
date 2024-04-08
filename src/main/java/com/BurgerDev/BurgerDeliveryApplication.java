package com.BurgerDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class BurgerDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerDeliveryApplication.class, args);
	}

}
