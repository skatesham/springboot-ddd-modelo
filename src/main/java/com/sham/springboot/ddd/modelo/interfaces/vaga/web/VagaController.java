package com.sham.springboot.ddd.modelo.interfaces.vaga.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VagaController {

	@ResponseBody
	@GetMapping
	public String home() {
		return "<h1>Home</h1>";
	}
	
}
