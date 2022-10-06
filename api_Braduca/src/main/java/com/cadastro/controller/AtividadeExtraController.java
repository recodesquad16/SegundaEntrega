package com.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeExtraController {
	
	@GetMapping ("/user")
	public String  completed() {
		return " concluida";
		
		
	}

}
