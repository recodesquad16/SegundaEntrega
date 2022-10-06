package com.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
	
	@GetMapping ("/user")
	public String registered  () {
	return"  cadastrado";
	}

}
