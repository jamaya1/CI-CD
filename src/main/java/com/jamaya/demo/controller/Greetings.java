package com.jamaya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

	@GetMapping(path="/saludo")
	public String saludo() {
		return "Hola CI-CD..";
	}
}
