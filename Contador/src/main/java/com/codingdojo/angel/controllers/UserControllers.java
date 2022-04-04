package com.codingdojo.angel.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControllers {
	
	@RequestMapping(value="/")
	public String index(HttpSession session) {
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}else {
			Integer currentCount = (Integer) session.getAttribute("counter");
			System.out.println(currentCount);
			session.setAttribute("counter", currentCount + 1);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}
	
	@RequestMapping(value="/doublecounter")
	public String doublecounter(HttpSession session) {
		return "doublecounter.jsp";
	}
	
	@RequestMapping(value="/restart")
	public String restart(HttpSession session) {
		session.setAttribute("counter", 0);
		return "counter.jsp";
	}
	
	
	
}
