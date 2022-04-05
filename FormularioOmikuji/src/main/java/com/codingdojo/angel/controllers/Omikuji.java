package com.codingdojo.angel.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Omikuji {

	@RequestMapping(value="/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping(value="/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/fortune", method=RequestMethod.POST)
	public String fortune(@RequestParam(value="number") int number,
						  @RequestParam(value="city_name") String city_name,
						  @RequestParam(value="real_person") String real_person,
						  @RequestParam(value="endeavor_hobby") String endeavor_hobby,
						  @RequestParam(value="living_thing") String living_thing,
						  @RequestParam(value="nice_someone") String nice_someone,
						  HttpSession session) {
		
		session.setAttribute("number_session", number);
		session.setAttribute("city_name_session", city_name);
		session.setAttribute("real_person_session", real_person);
		session.setAttribute("endeavor_hobby_session", endeavor_hobby);
		session.setAttribute("living_thing_session", living_thing);
		session.setAttribute("nice_someone_session", nice_someone);
		
		
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping(value="/omikuji/show", method=RequestMethod.GET)
	public String show() {
		return "show.jsp";
	}
}
