package com.codingdojo.angel.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.angel.modelos.Dojo;
import com.codingdojo.angel.servicios.ServicioDojos;

@Controller
@RequestMapping("/dojos")
public class ControladorDojos {

	private final ServicioDojos servicio;

	public ControladorDojos(ServicioDojos servicio) {
		this.servicio = servicio;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String home(Model model) {
		
		List<Dojo> dojos = servicio.get_all_dojos();
		model.addAttribute("lista_dojos", dojos);
		return "index.jsp";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String new_dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "new_dojo.jsp";
	}
	
	@PostMapping(value="/create")
	public String create_dojo(@Valid @ModelAttribute("dojo") Dojo dojo,
							  BindingResult result) {
		
		if(result.hasErrors()) {
			return "new_dojo.jsp";
		}else {
			servicio.save_dojo(dojo);
		}
		
		return "redirect:/dojos";
	}
	
	@GetMapping(value="/{dojo_id}")
	public String show(@PathVariable("dojo_id") Long id, Model model) {
		
		Dojo dojoEncontrado = servicio.find_dojo(id);
		model.addAttribute("dojo", dojoEncontrado);
		model.addAttribute("ninjas", dojoEncontrado.getNinjas());
		return "show.jsp";
		
	}
}
