package com.codingdojo.angel.controladores;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/daikichi/travel/{city}", method=RequestMethod.GET)
	public String travel(@PathVariable("city") String ciudad) {
		return "¡Felicitaciones! ¡Pronto viajarás a "+ciudad;
	}
	
	@RequestMapping(value="/daikichi/lotto/{number}", method=RequestMethod.GET)
	public String lotto(@PathVariable("number") int numero) {
		if(numero%2==0) {	
		return  "Harás un gran viaje en un futuro cercano, pero ten cuidado "
				+ "con las ofertas tentadoras";
		}else {
			return "Has disfrutado de los frutos de tu trabajo, "
					+ "pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}
	}
}
