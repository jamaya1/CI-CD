package com.jamaya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clase2 {
	@GetMapping(path="/saludo2")
	public String saludo() {
		return "Este es un mensaje de prueba2";
	}
}