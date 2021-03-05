package com.jamaya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clase3 {
	@GetMapping(path="/saludo3")
	public String saludo() {
		return "Este es un mensaje de prueba3";
	}
}