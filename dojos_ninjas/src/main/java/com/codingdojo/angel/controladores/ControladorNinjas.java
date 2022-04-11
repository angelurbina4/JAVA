package com.codingdojo.angel.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.angel.modelos.Dojo;
import com.codingdojo.angel.modelos.Ninja;
import com.codingdojo.angel.servicios.ServicioDojos;

@Controller
@RequestMapping("/ninjas")
public class ControladorNinjas {

	private final ServicioDojos servicio;

	public ControladorNinjas(ServicioDojos servicio) {
		
		this.servicio = servicio;
	}
	
	
	
	
	@GetMapping("/new")
	public String new_ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		
		List<Ninja> ninjas = servicio.get_all_ninjas();
		List<Dojo> dojos = servicio.get_all_dojos();
	
		model.addAttribute("lista_dojos", dojos);
		model.addAttribute("lista_ninjas", ninjas);
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, 
						  BindingResult result) {
		if(result.hasErrors()) {
			return "/ninjas/new.jsp";
		}else {
			servicio.save_ninja(ninja);
		}
		return "redirect:/dojos";
	}
	
	
}
