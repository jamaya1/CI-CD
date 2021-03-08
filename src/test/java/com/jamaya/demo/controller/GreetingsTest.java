package com.jamaya.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingsTest {

	@Test
	void saludoTest() {
		assertEquals("Hola mundo desde Davivienda 2.", new Greetings().saludo());
	}
}
