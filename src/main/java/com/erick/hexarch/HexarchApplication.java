package com.erick.hexarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HexarchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexarchApplication.class, args);
	}

}
