package com.codingdojo.angel.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {

	@RequestMapping(value="/daikichi", method=RequestMethod.GET)
	public String home() {
		return "¡Bienvenido!";
	}
	
	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
	public String today() {
		return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
	}
	
}
